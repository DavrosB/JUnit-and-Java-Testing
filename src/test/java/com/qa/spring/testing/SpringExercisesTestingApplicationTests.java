package com.qa.spring.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringExercisesTestingApplicationTests {

//	@Test
//	void contextLoads() {
//	
//		Demo.printHello();
	
	
	@Test
	public void createCocktailTest() {
		
		// Arrange
		// create a test cocktail to test method
		cocktails testCocktail = new cocktails("WhamBam", "Vodka", 3, "Coke", true);
		// create variables to pass into method
		String name = "WhamBam";
		String booze = "Vodka";
		int shots = 3;
		String mixers = "Coke";
		boolean cherry = true;
		
		//create variable to store result
		
		cocktails resultCocktail;
		
		//Act
		// do the test and save it as a variable
		
		resultCocktail = cocktailsService.createCocktail(name, booze, shots, mixers, cherry);
		
		
		//Assert
		
		
		assertEquals(testCocktail.getName(),resultCocktail.getName());
		assertEquals(testCocktail.getBooze(), resultCocktail.getBooze());
		assertEquals(testCocktail.getShots(), resultCocktail.getShots());
		assertEquals(testCocktail.getMixers(), resultCocktail.getMixers());
		assertEquals(testCocktail.isCherry(), resultCocktail.isCherry());

		
		
	}
	
		
	

}
