package com.qa.spring.testing;

public class cocktailsService {
	
	
	//create a new cocktail and returns a new cocktail
	
	public static cocktails createCocktail(String name, String booze, int shots, String mixers, boolean cherry) {
	
	cocktails newCocktail = new cocktails(name, booze, shots, mixers, cherry);
	
	// prints cocktail name to console
	System.out.println(newCocktail.getName());
	// prints type of boose to console
	System.out.println(newCocktail.getBooze());
	return newCocktail;
	
	}

}
