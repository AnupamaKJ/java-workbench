package com.learning.test;

import com.java.lib.MathsOperations;
import com.java.lib.MathsUtil;
import com.java.lib.TestStatic;

public class TestLib {

	public static void main(String[] args) {
		
		MathsOperations mathopertions = new MathsOperations();
		mathopertions.add(5, 6);
		
		//System.out.println(mathopertions.substract(8, 6));
				
		int sub = mathopertions.substract(8, 6);
		System.out.println(sub);
		
		TestStatic testStatic = new TestStatic();
		System.out.println(TestStatic.var1);
		System.out.println(testStatic.var2);
		
		MathsUtil.add(5,5);
		int sub1 = MathsUtil.substract(5, 3);
		System.out.println(sub1);
		
	}

}
