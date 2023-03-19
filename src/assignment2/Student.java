package assignment2;

public class Student {
	// instance variables.
	private String name;
	private int grade;
	private String GPA;

	// student class constructor with default values.
	public Student() {
		super();
		this.name = null;
		this.grade = 0;
		this.GPA = null;
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
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the gPA
	 */
	public String getGPA() {
		return GPA;
	}

	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(String gPA) {
		GPA = gPA;
	}

	// method to print information.
	public void printAttributes() {
		System.out.println("name:" + this.getName());
		System.out.println("grade:" + this.getGrade());
		System.out.println("GPA:" + this.getGPA());

	}
	//creating instance variable called "grade". as it was showing error because of two same variable name in same
	//class so i changed the name of instance variable as grade1.
	
	int grade1 = 6;

	public void printStudentGrade() {

		System.out.println("student grade:" + grade);

	}
	// Create a local variable called "sum".
	public void sum() {
		int a = 20;
		int b = 20;
		int sum = a + b;
		System.out.println("sum:" + sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
