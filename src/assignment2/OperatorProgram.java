package assignment2;

public class OperatorProgram {
	public static void main(String[] args) {
		// program that uses the relational operators to compare two integers.
		int z = 10;
		int x = 20;
		if (z >= x) {
			System.out.println("z is greater than or equals to x");
		} else {
			System.out.println("z is less than  x");
		}
		//  program that uses the assignment operator to assign a value to a
		// variable.

		String car = "isDamaged";
		System.out.println(" car:" + car);

		// program that uses the arithmetic operators to calculate the sum, difference,
		// product, and quotient of two integers.
		int a = 50;
		int b = 20;
		int sum = a + b;
		System.out.println("sum:" + sum);

		int difference = a - b;
		System.out.println("difference:" + difference);

		int product = a * b;
		System.out.println("product:" + product);

		int quotient = a / b;
		System.out.println("quotient:" + quotient);

		// program that uses the logical operators to determine if a number is positive
		// and even.
		int d = 8;
		if (d > 0 && d % 2 == 0) {

			System.out.println("number:" + d + " positive and even");
		} else {

			System.out.println("number:" + d + " is non positive or non even");
		}

		// program that uses the unary operators to increment and decrement a variable.
		int f = -5;
		System.out.println("number:" +(-f));

	}

}