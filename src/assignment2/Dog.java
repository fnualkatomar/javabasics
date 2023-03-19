package assignment2;

public class Dog extends Animal {

	// instance variables for breed and weight.
	String breed;
	int weight;

	//creating method of same name as in the parent class 
	public void makeSound() {
		String dogSound = "barking Sound";
		System.out.println("dog sound:" + dogSound);
	}

	public static void main(String[] args) {
		// creating object of Animal class and giving parameters
		Animal obj = new Animal("defill", 7);

		// calling the method of animal class
		obj.animalDetails();

		// creating object of subclass i.e. dog class
		Dog dog = new Dog();

		// calling method of parent class i.e. Animal class but it is calling subclass
		// method
		dog.makeSound();

	}

}
