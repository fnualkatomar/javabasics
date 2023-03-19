package assignment2;

public class ConditionalStatementsAndLoops {

	public static void main(String[] args) {

		int z = 10;
		int x = -11;
		String dayOfTheWeek = "sunday";

		// program that uses an if statement to determine if a number is positive or
		// negative
		if (z >= 0) {
			System.out.println("number:" + z + " is positive");
		} else {
			System.out.println("number:" + z + " is negative");
		}

		// program that uses an if-else statement to determine if a number is even or
		// odd.

		if (x >= 0) {
			System.out.println("number:" + x + " is even");
		} else {
			System.out.println("number:" + x + " is odd");
		}

		// program that uses a switch statement to determine the day of the week.

		switch (dayOfTheWeek) {
		case "sunday":
			System.out.println("day of the week is sunday");
			break;
		case "monday":
			System.out.println("day of the week is monday");
			break;
		default:
			System.out.println("i dont know the day of the week ");

		}
		// program that uses a for loop to print out the numbers from 1 to 10.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// program that uses a while loop to calculate the factorial of a number.
		// int j = 5;
		// while (j>=5) {
		// System.out.println(j);

		// }j++;
		// program that uses a break statement to exit a loop.
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i + ".hello word");
		}
		// program that uses a continue statement to skip an iteration of a loop.

		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i + ".hello word");
		}
		// program that uses nested loops to print out a multiplication table.

		for (int i = 2; i <= 20; i++) {

			for (int j = 1; j <= 10; j++) {//j=1; 
				int k = i * j;
				System.out.println(i + "*" + j + "=" + k);
			}//J++
			
			System.out.println("======================================");

		}

	}
}
