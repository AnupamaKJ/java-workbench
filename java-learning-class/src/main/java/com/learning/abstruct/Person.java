package com.learning.abstruct;

public class Person {
	
	// the name variable is declared as private, we cannot access it from outside this class:
	private String name;
	
	//getter
	
	public String getName() {
		return name;
	}
	
	//setter
	
	public void setName(String newName) {
		this.name= newName;
	}

}
