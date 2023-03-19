package assignment2;

public class AccessSpecifier {

	// Creating a public method in a class that prints out a message.
	public void printTheMessage() {
		System.out.println("How are you?");

	}

	// Creating a private instance variable in a class that represents the class's
	// password.
	private int password = 4578;

	public void representThePassword() {
		System.out.println("class Password:" + password);
	}

	// Creating a protected method in a class that returns the class's name.

	protected String myClassName() {
		String className = "AccessSpecifier";
		System.out.println("class name:" + className);
		return className;
	}

	//Creating a default instance variable in a class that represents the class's size.	
	int classSize;

	public int myClassSize() {

		System.out.println("class size:" + classSize);
		return classSize;
	}

	//Creating a public static variable in a class that represents the class's ID.

	public static String classID = "class456";

	public void RepresentTheClass() {
		System.out.println("classID:" + classID);
	}

}
