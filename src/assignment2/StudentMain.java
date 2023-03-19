package assignment2;

public class StudentMain {

	public static void main(String[] args) {
		// create student object to call method.
		Student student = new Student();

		// set the values.
		student.setName("Preeti");
		student.setGrade(10);
		student.setGPA("dght");

		// calling the method.
		student.printAttributes();
		//calling the access specifier class program
		AccessSpecifier accessSpecifier = new AccessSpecifier();
System.out.println(accessSpecifier.myClassName());		
	}

}
