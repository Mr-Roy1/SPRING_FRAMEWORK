package org.jsp.setterInjectionApp;

public class AudiImpl implements ICar {
	
	public AudiImpl() {
		System.out.println("Audi Implementation object created");
	}

	@Override
	public void drive() {
		System.out.println("Driving Audi happily!!!");
	}

}
