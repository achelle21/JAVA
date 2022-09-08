/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/19/2022)

This program will print a triangle after obtaining user input for the first number. */

import java.util.Scanner;
public class Asgn4 {

    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		System.out.println("What is your starting number? \n");
		int firstNum = scan.nextInt();

		for(int row = 0; row < 7; row++) {
            int cont = firstNum;
            
            for(int col = 0; col <= row; col++) {
                System.out.print(cont+ " ");
                cont++;
            }
            System.out.println();
		}scan.close();
	}
}
