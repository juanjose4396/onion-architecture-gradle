package infrastructure.repositories;

import com.xpert.group.onion.dto.Test;
import com.xpert.group.onion.repositories.TestRepository;

public class TestRepositoryImpl implements TestRepository{
	

	@Override
	public void save(Test test) {
		System.out.println("LLEGOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");	
	}
}
