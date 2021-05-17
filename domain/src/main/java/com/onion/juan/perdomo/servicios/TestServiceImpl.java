package com.onion.juan.perdomo.servicios;

import com.onion.juan.perdomo.dto.Test;
import com.onion.juan.perdomo.repositories.TestRepository;
import com.onion.juan.perdomo.servicios.interfaces.TestService;

public class TestServiceImpl implements TestService {
	
	private final TestRepository testRepository;

	public TestServiceImpl(final TestRepository testRepository) {
		this.testRepository = testRepository;
	}

	@Override
	public Long save(Test test) {
		return this.testRepository.save(test);
	}
}
