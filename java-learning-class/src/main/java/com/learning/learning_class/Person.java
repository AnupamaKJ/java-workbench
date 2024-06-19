package com.learning.learning_class;

public class Person {
	static String category = "vegeterian";
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
    public void method1() {
    	System.out.print(age);
    	System.out.println(category);
    }
    
    public static void method2() {
    //	System.out.print(age);
    	System.out.println(category);
    }

}
