package com.onion.juan.perdomo.example.resource;

import com.onion.juan.perdomo.application.common.Application;
import com.onion.juan.perdomo.service.example.dto.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestResource implements ExampleResource {
    private final Application exampleApplication;

    public ExampleRestResource(final Application exampleApplication) {
        this.exampleApplication = exampleApplication;
    }

    @Override
    public ResponseEntity<Long> save(Example example) {
        return ResponseEntity.ok(exampleApplication.save(example));
    }
}
