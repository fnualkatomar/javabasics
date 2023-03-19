package assignment2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	//Instance variables.
	private String name;
	private int age;
	private String gender;
	
	
	//static variable name as count.
		static int count=0 ;
	

	//generate non parameterized constructor with default values.
	public Person() {
		super();
		this.name = null;
		this.age = 0;
		this.gender = null;
		++count;
		System.out.println("COUNTER>>"+count);
	}
	//generate  parameterized constructor.
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		++count;
		System.out.println("COUNTER>>"+count);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//create the method to print information.
	public void printAttributes() {
		System.out.println("age:" + this.getAge());
		System.out.println("gender:" + this.getGender());
		System.out.println("name:" + this.getName());
		
	}
	
	//create the method to calculate age.
	public int calculateAge(LocalDate birthDate) {
		LocalDate currentDate = LocalDate.now();
		if ((birthDate != null) && (currentDate != null)) {
			return Period.between(birthDate, currentDate).getYears();
		} else {
			return 0;
		}
	}
	
	
	/**
	 *  this method is to print name and age.
	 * @param age2
	 */
	public void printPersonInformation( int age2) {
		System.out.println("my name is:"+this.name + " age:"+age2);
		
	}

	

}
