package com.onion.juan.perdomo.servicios;

import javax.inject.Inject;

import com.onion.juan.perdomo.dto.Test;
import com.onion.juan.perdomo.repositories.TestRepository;
import com.onion.juan.perdomo.servicios.interfaces.TestService;

public class TestServiceImpl implements TestService {
	
	private final TestRepository testRepository;
	
	@Inject
	public TestServiceImpl(final TestRepository testRepository) {
		this.testRepository = testRepository;
	}

	@Override
	public void save() {
		this.testRepository.save(new Test());
	}

}
