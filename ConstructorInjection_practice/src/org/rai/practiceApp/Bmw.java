package org.rai.practiceApp;

import java.util.List;

public class Bmw implements ICar{
	
	private int id;
	private String color;
	private Engine engine;
	private List<String>wheels;
	
	public Bmw(int id, String color, Engine engine, List<String> wheels) {
		super();
		this.id=id;
		this.color=color;
		this.engine=engine;
		this.wheels=wheels;
	}

	@Override
	public void drive() {
		System.out.println("Bmw id "+id);
		System.out.println("Bmw color "+color);
		System.out.println("bmw engine "+engine);
		System.out.println("bmw wheels "+wheels);
		System.out.println("drive bmw happily!!");
	}
}
