package com.qa.garage_task;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

	Vehicle vehicle;
	
	@Before
	public void init() {
		vehicle = new Vehicle(10, "branden", "green", "nice");
	}
	
	@Test
	public void getIdTest() {
		//Given
		int expectedResult = 10;
		
		//When
		int actualResult = vehicle.getId();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void setIdTest() {
		//Given
		int expectedResult = 13;
		
		//When
		vehicle.setId(expectedResult);
		int actualResult = vehicle.getId();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void getBrandTest() {
		//Given
		String expectedResult = "branden";
		
		//When
		String actualResult = vehicle.getBrand();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void setBrandTest() {
		//Given
		String expectedResult = "Toyota";
		
		//When
		vehicle.setBrand(expectedResult);
		String actualResult = vehicle.getBrand();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void getColourTest() {
		//Given
		String expectedResult = "green";
		
		//When
		String actualResult = vehicle.getColour();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void setColourTest() {
		//Given
		String expectedResult = "black";
		
		//When
		vehicle.setColour(expectedResult);
		String actualResult = vehicle.getColour();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void getTypeTest() {
		String expectedResult = "nice";
		
		String actualResult = vehicle.getType();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void setTypeTest() {
		String expectedResult = "motorbike";
		
		vehicle.setType(expectedResult);
		String actualResult = vehicle.getType();
		
		assertEquals(expectedResult, actualResult);
		
	}
	
}
