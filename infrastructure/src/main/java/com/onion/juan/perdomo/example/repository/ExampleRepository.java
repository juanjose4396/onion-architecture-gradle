package com.onion.juan.perdomo.example.repository;

import com.onion.juan.perdomo.service.example.dto.Example;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepository implements com.onion.juan.perdomo.service.example.repository.ExampleRepository {

	@Override
	public Long save(Example example) {
		return 1L;
	}
}
