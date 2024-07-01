package guviTask9;

import java.util.Scanner;

public class Q4Answer {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the size of the pattern: ");
		        int value = scanner.nextInt();

		       
		        for (int i = 1; i <= value; i++) {
		            for (int j = 1; j <= value; j++) {
		                if (j == i || j == value - i + 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print(" "); 
		                }
		            }
		            System.out.println(); 
		        }

		        scanner.close();
		    
		

	}

}

// Output :
//	 Enter the size of the pattern: 7
//	 *      * 
//	  *    *  
//	   *  *   
//	    *    
//	   *  *   
//	  *    *  
//	 *      * 

	 

