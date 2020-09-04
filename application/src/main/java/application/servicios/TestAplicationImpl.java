package application.servicios;

import javax.inject.Inject;

import application.servicios.interfaces.TestAplication;

public class TestAplicationImpl implements TestAplication {
	
	private final TestAplication testAplication;
	
	@Inject
	public TestAplicationImpl(final TestAplication testAplication) {
		this.testAplication = testAplication;
	}

	@Override
	public void save() {
		testAplication.save();
	}
	
}
