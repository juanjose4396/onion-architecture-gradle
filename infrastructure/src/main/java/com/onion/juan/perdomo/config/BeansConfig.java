package com.onion.juan.perdomo.config;

import com.onion.juan.perdomo.repositories.TestRepository;
import com.onion.juan.perdomo.servicios.TestServiceImpl;
import com.onion.juan.perdomo.servicios.interfaces.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public TestService testService(TestRepository testRepository) {
        return new TestServiceImpl(testRepository);
    }
}
