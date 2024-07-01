package guviTask9;

import java.util.Scanner;

public class Q2Answer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// user to enter a string
		System.out.print("Enter a string: ");
		String word = scanner.nextLine();

		// Initialize an empty string to store
		String characters = "";

		// Iterate over the input string in reverse order
		for (int i = word.length() - 1; i >= 0; i--) {
			characters += word.charAt(i); // Concatenate each character to reversed string
		}

		// Output the reversed string
		System.out.println("Reversed string: " + characters);

		scanner.close();
	}

}

// Output
// Enter a string: West indians
// Reversed string: snaidni tseW
