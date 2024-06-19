package com.learning.date;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		
		LocalTime myObjTime = LocalTime.now();
		
		System.out.println(myObjTime);
		
		LocalDateTime myObjDateTime = LocalDateTime.now();
		System.out.println(myObjDateTime);
		
		 System.out.println("Before formatting: " + myObjDateTime);
		 
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 
		 String formattedDate = myObjDateTime.format(myFormatObj);
		 
		   System.out.println("After formatting: " + formattedDate);
	}

}
