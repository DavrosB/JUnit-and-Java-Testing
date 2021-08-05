package com.qa.spring.testing;

public class Demo {
	
//	creating a new class to test
//	create a new method that returns and prints out the string "Hello world"
	
	public static String printHello() {
		
		System.out.println("Hello world");
		return "Hello World";
	}
	
	
	// create a method that returns Hello + <your name>
	
	
	public static String printsName(String name) {
	
	return "Hello" + name;
	
	}
	
	
	// create a method that doubles and adds 4 to your number
	
	public static int doubleSum(int num) {
		
		int result = num * 2;
		result += 4;
		return result;
		
	}
	
	public static String printsNameandColour(String name, String favColour) {
		
		return "Hello" + name + favColour;
	
	}	
	
}
