package com.learning.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");

		System.out.println(fruitCollection);

		//fruitCollection.remove("banana");

		System.out.println(fruitCollection);

		System.out.println(fruitCollection.contains("apple"));
		
		System.out.println("______________________");
		for(String a :fruitCollection)
		{
			System.out.println(a);
		}
		System.out.println("______________________");

		fruitCollection.forEach(a -> System.out.println(a));
		
		fruitCollection.clear();
		
		System.out.println(fruitCollection);
	}

}
