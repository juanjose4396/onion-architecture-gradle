package com.onion.juan.perdomo.service.example;

import com.onion.juan.perdomo.service.example.dto.Example;
import com.onion.juan.perdomo.service.example.repository.ExampleRepository;

public class ExampleDomainService implements ExampleService {
	private final ExampleRepository exampleRepository;

	public ExampleDomainService(final ExampleRepository exampleRepository) {
		this.exampleRepository = exampleRepository;
	}

	@Override
	public Long save(Example example) {
		return this.exampleRepository.save(example);
	}
}
