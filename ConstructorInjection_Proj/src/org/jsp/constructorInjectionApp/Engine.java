package org.jsp.constructorInjectionApp;

public class Engine {
	
	private int engine_number;
	private int horse_power;
	private String type;
	
	public Engine(int engine_number, int horse_power, String type ) {
		super();
		this.engine_number=engine_number;
		this.horse_power=horse_power;
		this. type= type;
	}
	
	@Override
	public String toString() {
		return "(Engine_number="+engine_number+", horse_power= "+horse_power+", type="+type+")";
	}
}
