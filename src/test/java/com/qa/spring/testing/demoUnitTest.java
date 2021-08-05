package com.qa.spring.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest

public class demoUnitTest {

//	 I want to test when we run this method
//	it prints the string "hello World"
	
//	 Tests that haven't passed before (or failed previously) 
//	are ran semi-randomly first
	
	@Test
	
	public void testPrintsHello() {
		
		// Arrange
		
		String testString;
		
		// Act
		testString = Demo.printHello();
		System.out.println(testString);
		
		
		// Assert
		
		assertEquals("Hello World", testString);
		
	}
	
	 @Test
	 public void testPrintsHelloName() {
		 
		 // Arrange
		 String testString;
		 String testName = "Davy";
		 
		 
		 // Act
		 testString = Demo.printsName(testName);
		 System.out.println(testString);
		 
		 
		 // Assert
		 assertEquals("Hello" + testName, testString);
		 
		 
	 }
	
	@Test
	
	public void testDoubleSum ( ) {
		
		// Arrange
		int result;
		int multiplyNum = 10;
		
		
		//Act
		result = Demo.doubleSum(multiplyNum);
		
		// Assert
		
		assertEquals("10 * 2 + 4", 24, result);
		
		
	}
	  
//	Test method for name and fav colour
	
		@Test
		public void testPrintsNameandColour() {
			 
			 // Arrange
			 String testString = "blahblah";
			 String testName = "Davy";
			 String testColour = "Blue";
			 
			 
			 // Act
			 testString = Demo.printsNameandColour(testName, testColour);
			 System.out.println(testString);
			 
			 
			 // Assert
			 assertEquals("Hello" + testName + testColour, testString);
			 
			 
		 }
		
		
	} 
	
	
	
	 

