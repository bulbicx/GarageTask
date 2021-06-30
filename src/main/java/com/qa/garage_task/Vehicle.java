package com.qa.garage_task;

import java.util.Objects;

public class Vehicle {

	private int id;
	private String brand;
	private String colour;
	private String type;
	
	public Vehicle(int id, String brand, String colour, String type) {
		this.id = id;
		this.brand = brand;
		this.colour = colour;
		this.type = type;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, id, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour) && id == other.id
				&& Objects.equals(type, other.type);
	}

	
	
}
