package assignment2;

public class Animal {
	
	 //instance variables for name and age.
	String name;
	int age;
	
	//creating method makeSound for parent class i.e.Animal class
	public void makeSound() {
		String animalsound = "sound of animal";
		System.out.println("animal sound:" + animalsound );
	}
	//creating non parameterized constructor
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	//creating  parameterized constructor
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//creating method animalDetails for constructor
	public void animalDetails() {
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);

	}
}
