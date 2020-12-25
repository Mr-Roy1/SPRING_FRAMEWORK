package org.jsp.constructorInjectionApp;

public class AudiImpl implements ICar{
	
	public AudiImpl() {
		System.out.println("Audi implementations object created");
	}

	@Override
	public void drive() {
		System.out.println("Driving Audi Car happily!!!!!");
	}

	 	
}
