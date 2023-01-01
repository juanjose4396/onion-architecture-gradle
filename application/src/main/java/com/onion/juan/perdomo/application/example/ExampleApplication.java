package com.onion.juan.perdomo.application.example;

import com.onion.juan.perdomo.application.common.Application;
import com.onion.juan.perdomo.service.example.dto.Example;
import com.onion.juan.perdomo.service.example.ExampleService;
import org.springframework.stereotype.Component;

@Component
public class ExampleApplication implements Application {
	private final ExampleService exampleService;

	public ExampleApplication(final ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	@Override
	public Long save(Example example) {
		return exampleService.save(example);
	}
}
