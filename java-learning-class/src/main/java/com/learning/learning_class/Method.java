package com.learning.learning_class;

public class Method {
	int x =5;
	final int y = 25;

	public static void main(String[] args) {
		Method m = new Method();

		Method m1 = new Method();
		m1.x=50;
		System.out.println(m.x);
		System.out.println(m1.x);
		
	}

}
