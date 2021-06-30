package com.qa.garage_task;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Motorbike motorbike = new Motorbike(0, "new", "red", "motorbike", true);
		Car car = new Car(22, "new", "black", "car", "ferrari", true);
		Car carOther = new Car(24, "new", "red", "car", "fiat", false);
		Car carOtherOther = new Car(25, "old", "purple", "car", "lamborghini", false);
		Bus bus = new Bus(33, "old", "white", "bus", 10);
		
		garage.addVehicle(bus);
		garage.addVehicle(car);
		garage.addVehicle(carOther);
		garage.addVehicle(carOtherOther);
		garage.addVehicle(motorbike);
		System.out.println(garage.vehicles.size());//2
		
//		System.out.println(garage.calculateBill()); //1750
//		
//		System.out.println(garage.fixVehicle(car)); //200
//		
//		garage.removeVehicle(0);
//		System.out.println(garage.vehicles.size()); //2
//		
//		garage.removeVehicle(car);
//		System.out.println(garage.doesExists(car)); // false
		
//		garage.removeVehiclesSameType(car);
//		System.out.println(garage.vehicles.size());//2
		
		garage.emptyGarage();
		System.out.println(garage.vehicles.size());//0
		
		

	}

}
