package com.qa.garage_task;

public class Bus extends Vehicle {

	private int numWheels;
	
	public Bus(int id, String brand, String colour, String type, int numWheels) {
		super(id, brand, colour, type);
		this.numWheels = numWheels;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	
}
