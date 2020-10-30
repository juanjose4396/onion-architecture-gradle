package com.onion.juan.perdomo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.onion.juan.perdomo.config.properties.SwaggerProperties;

@SpringBootApplication
@EnableConfigurationProperties(SwaggerProperties.class)
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
