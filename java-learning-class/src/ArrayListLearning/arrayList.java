package ArrayListLearning;

import java.util.ArrayList; // import the ArrayList class

public class arrayList {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		// Access an Item

		// To access an element in the ArrayList, use the get() method and refer to the
		// index number:
		System.out.println(cars.get(0));
		System.out.println("--------------");

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("--------------");
		for (String i : cars) {
			System.out.println(i);
		}
		System.out.println("***********");
		cars.set(0, "Opel");

		System.out.println(cars.get(0));

		cars.remove(3);
		System.out.println(cars);
		System.out.println(cars.size());

		cars.clear();
		System.out.println(cars);
		System.out.println("***********");

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		for (int i : myNumbers) {
			System.out.println(i);
		}

	}
}
