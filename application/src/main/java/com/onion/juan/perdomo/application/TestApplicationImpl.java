package com.onion.juan.perdomo.application;

import javax.inject.Inject;


import com.onion.juan.perdomo.application.interfaces.TestApplication;
import com.onion.juan.perdomo.servicios.interfaces.TestService;

public class TestApplicationImpl implements TestApplication {
	
	private final TestService testService;
	
	@Inject
	public TestApplicationImpl(final TestService testService) {
		this.testService = testService;
	}

	@Override
	public void save() {
		testService.save();
	}
	
}
