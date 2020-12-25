package org.jsp.setterInjectionApp;

public class Engine {
	private int engine_number;
	private int horse_power;
	private String type;
	
	public int getEngine_number() {
		return engine_number;
	}
	public void setEngine_number(int engine_number) {
		this.engine_number = engine_number;
	}
	public int getHorse_power() {
		return horse_power;
	}
	public void setHorse_power(int horse_power) {
		this.horse_power = horse_power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Details [Engine_Number= "+engine_number+" Horse_power= "+horse_power+" Type= "+type+"]";
	}

}
