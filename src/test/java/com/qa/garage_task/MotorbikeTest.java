package com.qa.garage_task;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MotorbikeTest {

	Motorbike motorbike;
	
	@Before
	public void init() {
		motorbike = new Motorbike(2, "Hyundai", "black", "motorbike", true);
	}
	
	@Test
	public void isHasAnHelmetTest() {
		boolean actualResult = motorbike.isHasAnHelmet();
		
		assertTrue(actualResult);
	}
	
	@Test
	public void setHasAnHelmet() {
		//Given
		boolean expectedResult = false;
		
		//When 
		motorbike.setHasAnHelmet(expectedResult);
		boolean actualResult = motorbike.isHasAnHelmet();
		
		//Then
		assertFalse(actualResult);
	}
}
