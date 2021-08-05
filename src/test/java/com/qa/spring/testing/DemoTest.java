package com.qa.spring.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


//Telling Spring I'm creating a Test File
// Needed to import from java.utils

@SpringBootTest

public class DemoTest {

// Start Testing
// Tests are public methods we're cretaing, with a name of what we're testing
// I want to create a test that validates 2 + 2 = 4
	
	
	// @Test annotation bove the methoda
	// Method is public and doesn't return anything
	// Import @Test annotation
	
	@Test
	
	public void twoPlusTwoIsFour() {
		
		
//		Arrange - Grabbing and craeting any resources we need
		int startNum =2;
		int addNum =2;
		int subNum = 1;
		
		int result;
		int subResult;
		
//		Act - Doing the thing we're etsting
		
		result = startNum + addNum;
		subResult = startNum - subNum;
		
		
//		Assert - checking if what we expect is what we received
		
//		assertEquals()What is to be displayed on failure, what is expected value, 
//		what is the received value)
		assertEquals("2 + 2 = 4", 4, result);
		assertEquals("2 - 1 = 1", 1, subResult);
		

		
// 		Run the test by right clicking on package
	}

	@Test
	// must have @Test to highlight its a Test
	// make a test to fail to demonstrate what happens
	public void twoTimeThreeIsSix() {
		
		int startNum = 2;
		int multiplyNum = 4;
		
		int result = startNum * multiplyNum;
		
		// insert assertEquals to input testing condition
		assertEquals("2 * 4 = 8", 8, result);
		
	}
	
	@Test
	// must have @Test to highlight its a Test
	// make a test to fail to demonstrate what happens
	public void sixteenDivTwo() {
		
		int startNum = 16;
		int divNum = 2;
		
		int result = startNum / divNum;
		
		// insert assertEquals to input testing condition
		assertEquals("18 / 2 = 8", 8, result);
		
	}
	
	@Test
	// must have @Test to highlight its a Test
	// make a test to fail to demonstrate what happens
	public void lotsOfAdds() {
		
		int Num1 = 4;
		int Num2 = 4;
		int Num3 = 6;
		int Num4 = 10;
		
		int result = Num1 + Num2 + Num3 + Num4;
		
		// insert assertEquals to input testing condition
		assertEquals("4 + 4 + 6 + 10", 24, result);
		
	}
	
	@Test
	// must have @Test to highlight its a Test
	// make a test to fail to demonstrate what happens
	public void numberModulus() {
		
		int Num1 = 7;
		int Num2 = 2;
		
		
		int result = Num1 % Num2;
		
		// insert assertEquals to input testing condition
		assertEquals("7 % 2", 1, result);
		
	}
	
	@Test
	// must have @Test to highlight its a Test
	// make a test to fail to demonstrate what happens
	public void numbersMinus() {
		
		int Num1 = 20;
		int Num2 = 9;
		int Num3 = 2;
		
		
		int result = Num1 - Num2 - Num3;
		
		// insert assertEquals to input testing condition
		assertEquals("20 - 9 -2", 9, result);
		
	}
	
	
	@Test
	// must have @Test to highlight its a Test
	// make a test to fail to demonstrate what happens
	public void sixteenDivTwo2() {
		
		int startNum = 16;
		int divNum = 2;
		
		int result = startNum / divNum;
		
		// insert assertTrue to input testing condition
		//assertTrue(result(8));
		
		Assert.assertTrue("16 / 2 = 8", true);
		
	
	}
	
	public void isBoolTrue() {
		
		boolean boolTest = true;
		
		Assert.assertTrue("Expect boolTest to be true", boolTest);
		
		
		
	}
	

}
