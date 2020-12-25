package org.jsp.setterInjectionApp;

import java.util.List;

public class BmwImpl implements ICar {
	private int id;
	private String color;  // PRIMITIVE DATATYPE //
	private Engine engine;  //  CLASS TYPE //
	private List <String> wheels;  // COLLECTION TYPE //
	
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
		System.out.println("BMW Car Details");
		System.out.println("Bmw Id: "+getId());
		System.out.println("Bmw Color: "+getColor());
		System.out.println("Bmw Engine Details: "+getEngine());
		System.out.println("Bmw Wheel: "+getWheels());
		System.out.println("Drive Bmw happily!!!!!");
	}
}
