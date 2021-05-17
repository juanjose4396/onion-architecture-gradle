package com.onion.juan.perdomo.repository;

import com.onion.juan.perdomo.dto.Test;
import com.onion.juan.perdomo.repositories.TestRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {

	@Override
	public Long save(Test test) {
		return 1L;
	}
}
