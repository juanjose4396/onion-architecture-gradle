package com.xpert.group.onion.servicios;

import javax.inject.Inject;

import com.xpert.group.onion.dto.Test;
import com.xpert.group.onion.repositories.TestRepository;
import com.xpert.group.onion.servicios.interfaces.TestService;

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
