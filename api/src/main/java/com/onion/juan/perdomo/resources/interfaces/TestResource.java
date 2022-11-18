package com.onion.juan.perdomo.resources.interfaces;

import com.onion.juan.perdomo.dto.Test;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping( "/test")
@Api("Test resource")
public interface TestResource {
    @ApiOperation(
            value = "send-code",
            response = Long.class,
            notes = "send code",
            produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "When every thing went OK")})
    @PostMapping
    ResponseEntity<Long> save(@RequestBody Test test);
}
