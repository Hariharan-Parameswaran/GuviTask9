package guviTask9;

import java.util.Scanner;

public class Q1Answer {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        // User to enter a string
		        System.out.print("Enter a string: ");
		        String word = scanner.nextLine();
		        
		        // Reverse the string using StringBuilder
		        String sent = new StringBuilder(word).reverse().toString();
		        
		        // Check if the original string is equal to the reversed string
		        boolean isPalindrome = word.equals(sent);
		        
		        // Print the result
		        System.out.println(word + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
		        
		        scanner.close();
  }

		
}

// Output
// Enter a string: week
// week is not a palindrome.


