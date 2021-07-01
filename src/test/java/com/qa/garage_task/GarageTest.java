package com.qa.garage_task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GarageTest {

	Garage garage;
	Car vehicleOne;
	Motorbike vehicleTwo;
	List<Vehicle> vehicles = new ArrayList<>();
	
	@Before
	public void init() {
		garage = new Garage();
		vehicleOne = new Car(10, "branden", "green", "nice", "n23f", true);
		vehicleTwo = new Motorbike(20, "Gevenk", "blue", "very", true);
		garage.vehicles.add(vehicleOne);
		garage.vehicles.add(vehicleTwo);
//		vehicles.add(vehicleOne);
//		vehicles.add(vehicleTwo);
	}
	
	@Test
	public void doesExistsTest() {
		boolean actualResult = garage.doesExists(vehicleOne);
		
		assertTrue(actualResult);
	}
	
	@Test
	public void calculateBillTest() {
		//Given
		int expectedResult = 550 + 400;
		
		//When
		int actualResult = garage.calculateBill();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addVehicleTest() {
		Car car = new Car(15, "Garken", "red", "wow", "ww20s", false);
		
		garage.addVehicle(car);
		boolean actualResult = garage.doesExists(car);
		
		assertTrue(actualResult);
	}
	
	@Test
	public void removeVehicleByIndexTest() {
		Motorbike motorbike = new Motorbike(20, "Gevenk", "blue", "very", true);
		garage.removeVehicle(motorbike);
		
		boolean actualResult = garage.doesExists(motorbike);
		
		assertFalse(actualResult);
	}
	
	@Test
	public void removeVehicleTest() {
		Motorbike anotherMotorbike = new Motorbike(22, "Gevenk", "blue", "very", true);
		garage.removeVehicle(anotherMotorbike);
		
		boolean actualResult = garage.doesExists(anotherMotorbike);
		
		assertFalse(actualResult);
	}
	
	@Test
	public void fixVehicleTest() {
		int expectedResult = 200;
		
		int actualResult = garage.fixVehicle(vehicleOne);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void emptyGarageTest() {
		int expectedResult = 0;
		
		garage.emptyGarage();
		int actualResult = garage.vehicles.size();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void removeVehiclesSameTypeTest() {
		Motorbike anotherMotorbike = new Motorbike(22, "Gevenk", "blue", "very", true);
		Motorbike aMotorbike = new Motorbike(27, "Koprovl", "red", "haha", false);
		
		garage.removeVehiclesSameType(anotherMotorbike);
		boolean actualResult = garage.doesExists(aMotorbike);
		boolean actualResultTwo = garage.doesExists(anotherMotorbike);
		
		assertFalse(actualResult);
		assertFalse(actualResultTwo);
	}
}
