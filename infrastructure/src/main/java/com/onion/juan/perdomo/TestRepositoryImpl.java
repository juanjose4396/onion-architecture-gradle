package com.onion.juan.perdomo;

import com.onion.juan.perdomo.dto.Test;
import com.onion.juan.perdomo.repositories.TestRepository;

public class TestRepositoryImpl implements TestRepository{

	@Override
	public void save(Test test) {
		System.out.println("hello onion");			
	}
}
