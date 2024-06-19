package com.learning.learning_class;

public class Constructor {
	 int x;  // Create a class attribute

	  // Create a class constructor for the Main class
	  public Constructor() {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	public static void main(String[] args) {
		Constructor myObj = new Constructor();
		System.out.println(myObj.x);

	}

}
