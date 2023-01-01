package com.onion.juan.perdomo.config;

import com.onion.juan.perdomo.service.example.repository.ExampleRepository;
import com.onion.juan.perdomo.service.example.ExampleDomainService;
import com.onion.juan.perdomo.service.example.ExampleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ExampleService testService(ExampleRepository testRepository) {
        return new ExampleDomainService(testRepository);
    }
}
