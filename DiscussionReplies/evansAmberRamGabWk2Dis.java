/**
 * This program will record the average of three different numbers inserted by the user. 
 * 
 */

import java.util.Scanner;

class Wk2_Discussion {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int newNum; // Amber update

		int sum = 0;
		int avg = 0;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("This program will calculate the average of numbers"); // Amber update: removed "three"
			System.out.println();
			System.out.println("Enter Number 1: ");
			System.out.println();
			num1 = scanner.nextInt();
			System.out.println("Enter Number 2: ");
			System.out.println();
			num2 = scanner.nextInt();
			System.out.println("Enter Number 3: ");
			System.out.println();
			num3 = scanner.nextInt();
			System.out.println();
			System.out.println("Enter Number 4 as a negative number: "); // Amber update
			System.out.println();
			newNum = scanner.nextInt(); // Amber update
		}


		sum = num1 + num2 + num3 + newNum; // Amber update: added newNum
				
		avg = sum / 4; // Amber update: changed 3 to a 4
		
		System.out.println("The average of the numbers entered is " +avg); // Amber update: removed "three"
		

	}
}