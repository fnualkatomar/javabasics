package assignment2;

import java.time.LocalDate;

public class PersonMain {

	public static void main(String[] args) {
		
		//create the object to call non parameterized constructor.
		Person person = new Person();
		
		//set the values. 
		person.setAge(34);
		person.setName("alka");
		person.setGender("F");
		
		// calling the method.
		person.printAttributes();
		
		//creating person1 object to call parameterized constructor.
		Person person1 = new Person("puja", 30, "F");
		
		// calling the method of person class.
		person1.printAttributes();
		
		LocalDate bDate = LocalDate.of(1989, 03, 06);
		
		int age = person1.calculateAge(bDate);
		person1.printPersonInformation(age);

		

	}

}
