package com.learning.learning_class;

public class Constructor_Parameter {
	int x;

	  public Constructor_Parameter(int y) {
	    x = y;
	  }

	public static void main(String[] args) {
		Constructor_Parameter myObj = new Constructor_Parameter(5);
		System.out.println(myObj.x);
		

	}

}
