package com.java.learning.strings;

public class string_addition {

	public static void main(String[] args) {
		
		//If you add two numbers, the result will be a number:
	    int x = 10;
	    int y = 20;
	    int z = x + y;
	    System.out.println(z);
	    
	    //If you add two strings, the result will be a string concatenation:
	    
	    String x1 = "10";
	    String y1 = "20";
	    String z1 = x1 + y1;  // z will be 1020 (a String)
	    System.out.println(z1);
	    
	    //If you add a number and a string, the result will be a string concatenation:
	    String x2 = "10";
	    int y2 = 20;
	    String z2 = x2 + y2;  // z will be 1020 (a String)
	    System.out.println(z2);
	  }
}
