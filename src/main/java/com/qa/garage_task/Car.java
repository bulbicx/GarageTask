package com.qa.garage_task;

public class Car extends Vehicle {

	private String modelName;
	private boolean isAutomatic;
	
	public Car(int id, String brand, String colour, String type, String modelName, boolean isAutomatic) {
		super(id, brand, colour, type);
		this.modelName = modelName;
		this.isAutomatic = isAutomatic;
	}

	public void honk() {
		System.out.println("honk honk");
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
}
