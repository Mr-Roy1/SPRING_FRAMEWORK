package org.rai.practiceApp;

import java.util.List;

public class Bmw implements ICar {
	private int id;
	private String color;          // primitive type //
	private Engine engine;         // class type //
	private List<String> wheels;   // collection type //


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<String> getWheels() {
		return wheels;
	}

	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}

	@Override
	public void drive() {
		System.out.println("bmw id "+getId());
		System.out.println("bmw color "+getColor());
		System.out.println("bmw engine "+getEngine());
		System.out.println("bmw wheel "+getWheels());
		System.out.println("drive bmw happily");
	}
}
