package com.learning.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

// how to create an ArrayList from another collection using the arrayList(collection c ) constructor
//how to add all the elements from an existing collection to the new Arraylist using the addAll() method

public class CreateArrayLIstFromCollectionExample {

	public static void main(String[] args) {
		
		//create arraylist object
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		List<Integer> NextFivePrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);	
		NextFivePrimeNumbers.add(13);
		NextFivePrimeNumbers.add(17);
		NextFivePrimeNumbers.add(19);
		NextFivePrimeNumbers.add(23);
		NextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(NextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
		
	}

}
