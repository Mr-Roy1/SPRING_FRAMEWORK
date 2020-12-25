package org.rai.practiceApp;

public class Engine {
	private int engine_no;
	private int horse_power;
	private String type;
	public int getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(int engine_no) {
		this.engine_no = engine_no;
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
		return "details[engine details= "+engine_no+"horse power= "+horse_power+"engine type= "+type+"]";
	}

}
