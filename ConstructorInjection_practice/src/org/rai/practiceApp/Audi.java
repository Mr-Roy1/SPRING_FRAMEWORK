package org.rai.practiceApp;

public class Audi implements ICar {
	
	public Audi() {
		System.out.println("Audi object created!!!");
	}
	
	@Override
	public void drive() {
		System.out.println("drive audi happily");
	}

}
