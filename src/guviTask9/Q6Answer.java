package guviTask9;

import java.util.Scanner;

public class Q6Answer {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        // Input month number
		 System.out.println("Enter the month : ");
	        int month = scanner.nextInt();

	        // Input room rent per day
	        System.out.println("Enter  the room rent for per day : ");
	        double roomRent = scanner.nextDouble();

	        // Input number of days stayed
	        System.out.println("Enter the number of days stay in room : ");
	        int numDays = scanner.nextInt();

	        // Calculate total rent before applying peak season multiplier
	        double totalRent = roomRent * numDays;

	  
	        boolean isPeakSeason = false;
	        switch (month) {
	            case 4:
	            case 5:
	            case 6:
	            case 11:
	            case 12:
	                isPeakSeason = true;
	                break;
	            default:
	                isPeakSeason = false;
	                break;
	        }

	        if (isPeakSeason) {
	            totalRent *= 1.2; // 20% increase
	        }

	        // Output the total rent formatted to two decimal places
	        System.out.println(totalRent);

	        scanner.close();
	}

}

// Output :
//	     Enter the month : 
//		 5
//		 Enter  the room rent for per day : 
//		 1250
//		 Enter the number of days stay in room : 
//		 4
//		 6000.0