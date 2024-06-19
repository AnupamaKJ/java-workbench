package com.learning.access.specifier;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		//since defaultVar1 's access specifier is default, it has to be accessed with in the same package
		//System.out.println(p1.defaultVar1);
		
		//
		System.out.println(p1.publicVar1);

	}

}
