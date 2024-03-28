package com.java.learning.strings;

public class string_example {
	
	public static void main(String[] args) {
		
		//Create a variable of type String and assign it a value:	
		String greeting = "Hello";
		System.out.println(greeting);
		
		//String Length
		
	    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt.length());
	    
	    //There are many string methods available, for example toUpperCase() and toLowerCase():
	    
	    String txt1 = "Hello World";
	    System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
	    System.out.println(txt1.toLowerCase());   // Outputs "hello world"

	    //Finding a Character in a String
	    
	    String txt2 = "Please locate where 'locate' occurs!";
	    System.out.println(txt2.indexOf("where"));
	    
	    
	    //String Concatenation
	    
	    String firstName = "John ";
	    String lastName = "Doe";
	    System.out.println(firstName + "" + lastName);
	    
	    //You can also use the concat() method to concatenate two strings:
	    
	    System.out.println(firstName.concat(lastName));

	}

}
