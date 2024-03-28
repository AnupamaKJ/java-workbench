package com.java.learning.strings;

public class java_boolean {

	public static void main(String[] args) {
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false


		//Boolean Expression
		//A Boolean expression returns a boolean value: true or false.

		//This is useful to build logic, and find answers.
		
		int x = 10;
		int y = 9;
		System.out.println(x > y);
		
	
		 int myAge = 25;
		 int votingAge = 18;

			if (myAge >= votingAge) {
			  System.out.println("Old enough to vote!");
			} else {
			  System.out.println("Not old enough to vote.");
			}
			
		int randomNum = (int)(Math.random() * 20);
		System.out.println(randomNum);
		int testNum = 18;

		if (randomNum >= testNum) {
		  System.out.println("Random number is Greater");
		} else {
		  System.out.println("Random number is Smaller");
		}
	
	}

}
