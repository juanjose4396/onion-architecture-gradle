package com.onion.juan.perdomo.resources;

import com.onion.juan.perdomo.application.interfaces.TestApplication;
import com.onion.juan.perdomo.config.properties.ApiProperties;
import com.onion.juan.perdomo.dto.Test;
import com.onion.juan.perdomo.resources.interfaces.TestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestResource implements TestResource {

    private final TestApplication testApplication;

    public TestRestResource(final TestApplication testApplication) {
        this.testApplication = testApplication;
    }

    @Override
    public ResponseEntity<Long> save(Test test) {
        return ResponseEntity.ok(testApplication.save(test));
    }
}
