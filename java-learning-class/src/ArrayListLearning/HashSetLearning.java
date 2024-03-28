package ArrayListLearning;

import java.util.HashSet;

public class HashSetLearning {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    // Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
	    
	    //Check If an Item Exists
	    System.out.println(cars.contains("BMW"));
	    
	    cars.remove("Volvo");
	    
	    System.out.println(cars);
	}

}
