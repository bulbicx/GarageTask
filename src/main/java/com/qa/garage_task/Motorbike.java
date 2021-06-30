package com.qa.garage_task;

public class Motorbike extends Vehicle {
	
	private boolean hasAnHelmet;
	
	public Motorbike() {
		this(0, "brand", "colour", "type", false);
	}
	
	public Motorbike(int id, String brand, String colour, String type, boolean hasAnHelmet) {
		super(id, brand, colour, type);
		this.hasAnHelmet = hasAnHelmet;
	}

	public boolean isHasAnHelmet() {
		return hasAnHelmet;
	}

	public void setHasAnHelmet(boolean hasAnHelmet) {
		this.hasAnHelmet = hasAnHelmet;
	}
	
}
