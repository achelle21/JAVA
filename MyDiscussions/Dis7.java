/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/30/2022)
  This program will collect a list of numbers from user and print original list once, 
  then print the numbers to the 3rd power in a separate list. */

import java.util.Scanner; // import scanner to read user input
import java.util.Arrays; //  allows use of toString method

public class Dis7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5]; // an array with a limit of 5 elements
        int num, i;
        
        System.out.println("Choose five numbers. ");
        for (i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            num = scan.nextInt(); // reads numbers entered by reader
            numbers[i] = num; // entered numbers become elements in array
        }
        System.out.print(Arrays.toString(numbers)+ "\n"); // print original array within []
        
        // below prints the listed numbers to the 3rd power
        for (i = 0; i < numbers.length; i++){
            System.out.print(" " +Math.pow(numbers[i], 3)); 
        } 
    }
}
