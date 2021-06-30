package com.qa.garage_task;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> vehicles;
	
	public Garage() {
		vehicles = new ArrayList<>();
	}
	
	public Garage(List<Vehicle> vehicles) {
		if (vehicles != null)
			this.vehicles = vehicles;
		else
			this.vehicles = new ArrayList<>();
	}
	
	public boolean doesExists(Vehicle vehicle) {
		if (vehicles.contains(vehicle)) {
			return true;
		}
		return false;
	}
	
	public int calculateBill() {
		int carBill = 400;
		int motorbikeBill = 550;
		int busBill = 800;
		int total = 0;
		
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				total += carBill;
			} else if (vehicle instanceof Bus) {
				total += busBill;
			} else if (vehicle instanceof Motorbike) {
				total += motorbikeBill;
			}
		}
		
		return total;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void removeVehicle(int i) {
		vehicles.remove(i);
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}
	
	public int fixVehicle(Vehicle vehicle) {
		int carPrice = 200;
		int motorbikePrice = 150;
		int busPrice = 400;
		int total = 0;
		
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicle instanceof Car) {
				total += carPrice;
				break;
			} else if (vehicle instanceof Bus) {
				total += busPrice;
				break;
			} else if (vehicle instanceof Motorbike) {
				total += motorbikePrice;
				break;
			}
		}
		
		return total;
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}
	
	public void removeVehiclesSameType(Vehicle vehicle) {
		for(int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i) instanceof Vehicle) {
				vehicles.remove(i);
			} 
		}
	}
}
