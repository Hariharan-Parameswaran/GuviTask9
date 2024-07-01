package guviTask9;

import java.util.Scanner;

public class Q5Answer {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        // Taking input from user
	        System.out.print("Enter marks scored by the student: ");
	        int marks = scanner.nextInt();

	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid Input");
	        } else {
	            // Determining the grade based on the marks
	            char grade;
	            if(marks == 100) {
	            	grade = 'S';
	            }else if (marks >= 90 && marks < 100) {
	                grade = 'A';
	            }else if (marks >= 80 && marks < 90) {
	                grade = 'B';
	            } else if (marks >= 70 && marks < 80) {
	                grade = 'C';
	            } else if (marks >= 60 && marks < 70) {
	                grade = 'D';
	            } else if (marks >= 50 && marks < 60) {
	                grade = 'E';
	            } else {
	                grade = 'F';
	            }

	            // Outputting the grade
	            System.out.println("Grade: " + grade);
	        }

	        scanner.close();
	}

}

//Output :
//	Enter marks scored by the student: 59
//	Grade: E
