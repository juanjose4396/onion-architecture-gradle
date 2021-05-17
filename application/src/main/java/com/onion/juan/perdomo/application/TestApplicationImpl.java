package com.onion.juan.perdomo.application;

import com.onion.juan.perdomo.application.interfaces.TestApplication;
import com.onion.juan.perdomo.dto.Test;
import com.onion.juan.perdomo.servicios.interfaces.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationImpl implements TestApplication {
	
	private final TestService testService;

	public TestApplicationImpl(final TestService testService) {
		this.testService = testService;
	}

	@Override
	public Long save(Test test) {
		return testService.save(test);
	}
	
}
