package com.onion.juan.perdomo.resources.interfaces;

import com.onion.juan.perdomo.dto.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestResource {

    @PostMapping
    ResponseEntity<Long> save(@RequestBody Test test);
}
