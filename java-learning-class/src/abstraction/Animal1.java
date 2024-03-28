package abstraction;

public class Animal1 {

	public static void main(String[] args) {
		
		//From the example above, it is not possible to create an object of the Animal class:
		
		//Animal a1 = new Animal();
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		
	}

}
