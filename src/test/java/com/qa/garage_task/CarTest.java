package com.qa.garage_task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	Car car;
	
	@Before
	public void init() {
		car = new Car(1, "Ferrari", "red", "car", "new", true);
	}
	
	@Test
	public void getModelNameTest() {
		//Given
		String expectedResult = "new";
		
		//When
		String actualResult = car.getModelName();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void setModelNameTest() {
		//Given
		String expectedResult = "Fiat";
		
		//When
		car.setModelName(expectedResult);
		String actualResult = car.getModelName();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void isAutomaticTest() {
		//When
		boolean actualResult = car.isAutomatic();
		
		//Then
		assertTrue(actualResult);
	}
	
	@Test
	public void setAutomaticTest() {
		//Given
		boolean expectedResult = false;
		
		//When
		car.setAutomatic(expectedResult);
		boolean actualResult = car.isAutomatic();
		
		//Then
		assertFalse(actualResult);
	}
}
