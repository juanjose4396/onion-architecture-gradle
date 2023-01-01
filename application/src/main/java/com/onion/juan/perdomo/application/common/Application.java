package com.onion.juan.perdomo.application.common;

import com.onion.juan.perdomo.service.example.dto.Example;
import org.springframework.transaction.annotation.Transactional;

public interface Application {
	@Transactional
	Long save(Example example);
}
