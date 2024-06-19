package com.learning.learning_class;

public class Multiple_attributes {
//instance variables
	String fname = "John";
	String lname = "Doe";
	int age = 24;
	
	static int y=10;

	public Multiple_attributes() {
		fname = "Annappa";
	}

	public static void main(String[] args) {
		Multiple_attributes ma = new Multiple_attributes();
		System.out.println("name : " + ma.fname + " " + ma.lname);
		System.out.println("age : " + ma.age);
		
		Multiple_attributes ma1 = new Multiple_attributes();
		System.out.println("name : " + ma1.fname + " " + ma1.lname);
		System.out.println("age : " + ma1.age);
		
		Multiple_attributes ma2 = new Multiple_attributes();
		System.out.println("name : " + ma2.fname + " " + ma2.lname);
		System.out.println("age : " + ma2.age);
		System.out.println(y);
		// System.out.println(age);
	}
	
	public void method2() {
		System.out.println(age);
		System.out.println(y);
	}

}
