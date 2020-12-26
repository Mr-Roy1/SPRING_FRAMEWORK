package org.jsp.constructorInjectionApp;

import java.util.List;


public class BmwImpl implements ICar {
	
	private int id;
	private String color;             // PRIMITIVE DATATYPE //
	private Engine engine;           //  CLASS TYPE //
	private List <String> wheels;   // COLLECTION TYPE
	
	
	public BmwImpl(int id, String color, Engine engine, List<String> wheels) {
		super();
		this.id=id;
		this.color=color;
		this.engine=engine;
		this.wheels=wheels;
	}


	@Override
	public void drive() {
		System.out.println("Bmw Car Details...");
		System.out.println("Bmw id: "+id);
		System.out.println("Bmw color: "+color);
		System.out.println("Bmw engine details: "+engine);
		System.out.println("Bmw wheels details: "+wheels);
		System.out.println("Driving Bmw car happily!!!!!");
	}
	

}
