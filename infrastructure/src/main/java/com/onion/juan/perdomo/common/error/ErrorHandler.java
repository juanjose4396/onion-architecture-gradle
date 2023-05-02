package com.onion.juan.perdomo.common.error;

import com.onion.juan.perdomo.common.exception.TecnicalException;
import com.onion.juan.perdomo.service.example.exception.ExampleValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {
    private static final String DEFAULT_MESSAGE_ERROR = "Ocurrio un error inesperado, contacte con el administrador";
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorHandler.class);
    private final ConcurrentMap<String, Integer> EXCEPTION_CODES_STATUS = new ConcurrentHashMap<>();

    public ErrorHandler(){
        EXCEPTION_CODES_STATUS.put(ExampleValidationException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        EXCEPTION_CODES_STATUS.put(TecnicalException.class.getSimpleName(), HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Error> handleAllExceptions(Exception exception) {
        String exceptionName = exception.getClass().getSimpleName();
        Integer code = EXCEPTION_CODES_STATUS.get(exceptionName);

        if(code == null) {
            LOGGER.error(exceptionName, exception);
            Error error = new Error(DEFAULT_MESSAGE_ERROR);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
        Error error = new Error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.valueOf(code)).body(error);
    }
}
