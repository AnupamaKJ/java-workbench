package com.learning.learning_class;

public class TestPerson {
	public static void main(String args[]) {

		Person p1 = new Person("Annappa", 35);
		System.out.println(p1.name + " " + p1.age);
		System.out.println(Person.category);
		System.out.println(p1.category);
	//	System.out.println(Person.age);

	}

}
