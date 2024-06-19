package com.learning.access.specifier;

public class PersonSubClass1 extends Person {
	
	// Person's myMethod is overriden here
	public void myMethod() {
		System.out.println("Person subclass overriden Method");
	}

	
	// protected method can be overriden here, its in the same package
	protected void myMethod2() {
		System.out.println("Person subclass overriden Method2");
	}

	//Method is not overriden here, this has become a new method in PersonSubClass1
	private void myMethod3() {
		System.out.println("Person subclass non-overriden Method3");
	}
}
