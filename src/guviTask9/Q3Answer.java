package guviTask9;

import java.util.Scanner;

public class Q3Answer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of value: ");
		int value = scanner.nextInt();
		scanner.close();

		int number = 1;

		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}

// Output
// Enter the number of value: 6
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 