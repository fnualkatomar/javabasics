package assignment2;

public class MethodUtility {
	// two variables for sum.
	int a;
	int b;

	// two variables for product.
	int i;
	int j;

	// create the method sumOfTwoIntegers with return type.
	public int sumOfTwoIntegers(int a, int b) {
		int c = a + b;
		System.out.println("sum:" + c);
		return c;
	}

	// create the method lengthOfString with return type.
	public int lengthOfString(String weather) {
		int lengthOfString = weather.length();
		System.out.println("Length of String:" + lengthOfString);
		return lengthOfString;
	}

	// create the method productOfTwoIntegers with return type.
	public int productOfTwoIntegers(int i, int j) {
		int k = i * j;
		System.out.println("product:" + k);
		return k;
	}

	// method that takes a string as a parameter and returns the string in reverse.
	public String reverse(String foodIsYummy) {

		return null;
	}

	// method that takes two integers as parameters and returns the larger of the
	// two.
	public static int methodOfTwoIntegers(int k, int l) {
		int z = 0;

		if (k > l) {
			System.out.println("k:" + k);
			z = k;

		} else {
			System.out.println("l:" + l);
			z = l;
		}
		return z;

	}

	// static method that calculates the factorial of a number.
	public static void factorsOfNumber(int k) {

		for (int j = 1; j <= k; j++) {
			if (k % j == 0) {
				System.out.println(k + " Divisible by " + j);
			}
		}
	}

	// non-static method that calculates the area of a circle.
	public Float areaOfCircle() {
		Float r = 20.6f;
		Float pi = 3.14f;
		Float a = pi * r;
		System.out.println("area of circle:" + a);
		return a;

	}
}