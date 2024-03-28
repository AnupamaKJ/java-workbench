package com.java.learning.strings;

public class If_Else_condition {

	public static void main(String[] args) {
	
		if (20 > 18)
		{
		      System.out.println("20 is greater than 18"); // obviously
		}
		
		 	int x = 20;
		    int y = 18;
		    if (x > y)
		    {
		      System.out.println("x is greater than y");
		    }  
		    
		    // If Else condition
		    
		    int time = 20;
		    if (time < 18) {
		      System.out.println("Good day.");
		    } else {
		      System.out.println("Good evening.");
		    }		    // Outputs "Good evening."

		    //The else if Statement
		    
		    int time1 = 22;
		    if (time1 < 10) {
		      System.out.println("Good morning.");
		    } else if (time1 < 18) {
		      System.out.println("Good day.");
		    }  else {
		      System.out.println("Good evening.");
		    }
		    
		    
		    
		    int time2 = 20;
		    if (time2 < 18) {
		      System.out.println("Good day.");
		    } else {
		      System.out.println("Good evening.");
		    }
		    
		  //Short Hand If...Else
		    
		    int time3 = 20;
		    String result = (time3 < 18) ? "Good day." : "Good evening.";
		    System.out.println(result);



	}

}
