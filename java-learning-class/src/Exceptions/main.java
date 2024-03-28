package Exceptions;

public class main {

	public static void main(String[] args) {
		
		checkAge(15); // Set age to 15 (which is below 18...)
		
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}finally {
		      System.out.println("The 'try catch' is finished.");
	    }
	}
	
	 static void checkAge(int age) {
		    if (age < 14) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }
		   
}
