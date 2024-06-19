package com.learning.access.specifier;

public class Person {
	String name = "Annapa";
	int age = 35; 
	int defaultVar1 = 10;
	public int publicVar1 = 10;
	
	public void myMethod() {
		System.out.println("Person Method");
	}
	
	protected void myMethod2() {
		System.out.println("Person Method2");
	}
	
	private void myMethod3() {
		System.out.println("Person Method3");
	}

}
