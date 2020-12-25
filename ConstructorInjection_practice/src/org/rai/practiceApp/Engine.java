package org.rai.practiceApp;

public class Engine {
	private int engine_no;
	private int horse_power;
	private String type;
	
	public Engine(int engine_no, int horse_power, String type) {
		this.engine_no=engine_no;
		this.horse_power=horse_power;
		this.type=type;
	}

	@Override
	public String toString() {
		return "details [engine number= "+engine_no+" horse power= "+horse_power+" engine type= "+type+"]";
	}
}
