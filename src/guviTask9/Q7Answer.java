package guviTask9;

import java.util.Scanner;

public class Q7Answer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input three numbers
		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Enter the third number: ");
		double num3 = scanner.nextDouble();

		// Find the largest number
		double largest = num1;
		if (num2 > largest) {
			largest = num2;
		}
		if (num3 > largest) {
			largest = num3;
		}

		// Output the result
		System.out.println("The largest number is: " + largest);

		scanner.close();
	}

}

// Output :
//	     Enter the first number: 
//		 52
//		 Enter the second number: 
//		 42
//		 Enter the third number: 
//		 78
//		 The largest number is: 78.0