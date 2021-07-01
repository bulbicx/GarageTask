package com.qa.garage_task;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BusTest {
	
	Bus bus;
	
	@Before
	public void init() {
		bus = new Bus(0, "AiAiBrand", "blue", "bus", 10);		
	}
	
	@Test
	public void getNumWheelsTest() {
		//Given
		int expectedNumWheels = 10;
		
		//When
		int actualNumWheels = bus.getNumWheels();
		
		//Then
		assertEquals(expectedNumWheels, actualNumWheels);
	}
	
	@Test
	public void setNumWheelsTest() {
		//Given
		int expectedResult = 12;
		
		//When
		bus.setNumWheels(expectedResult);
		int actualResult = bus.getNumWheels();
		
		//Then
		assertEquals(expectedResult, actualResult);
	}
}
