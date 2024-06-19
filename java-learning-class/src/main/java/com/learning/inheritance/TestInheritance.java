package com.learning.inheritance;

public class TestInheritance {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.honk();
	
		// Create a myCar object
		Car myCar = new Car();
		myCar.honk();

		// Display the value of the brand attribute (from the Vehicle class) and the
		// value of the modelName from the Car class
		System.out.println(myCar.brand + " " + myCar.modelName);
		
		
		Lorry l1 = new Lorry();
		l1.honk();
	}
}
