package com.java.learning.strings;

public class java_math {

	public static void main(String[] args) {

	    System.out.println(Math.min(5, 10));  
	    System.out.println(Math.sqrt(64)); 
	    
	    //Math.abs(x) -- The Math.abs(x) method returns the absolute (positive) value of x:
	    
	    System.out.println(Math.abs(-4.7)); 
	    
	    // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
	    System.out.println(Math.random()); 
	    
	    //To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:
	    int randomNum = (int)(Math.random() * 101);  // 0 to 100
	    System.out.println(randomNum);

	}

}
