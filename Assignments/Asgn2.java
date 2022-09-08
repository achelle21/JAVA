/* Name: Evans, Amber 	CMIS 141/7380 	Date: (04/05/2022)
 This program will take three inputs from the user, create an operation with out of the inputs, and
 if the inputs are invalid shows an error message*/ 

import java.util.Scanner;
public class Asgn2 {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Choose two numbers between 200 and 1000.");
        System.out.println("\n");

        System.out.print("Enter first number: ");
        int numOne = scan.nextInt(); // first number variable
     
        System.out.print("Enter second number: ");
        int numTwo = scan.nextInt(); // second number variable

        //below are if statements to return error message if numbers are outside pararmeters
        if (numOne < 200 || numOne > 1000) {
            System.out.print("Not a valid number choice.");
            System.out.println("\n");
            extracted();

        } else if (numTwo < 200 || numOne > 1000) {
            System.out.print("Not a valid number choice.");
            System.out.println("\n");
            extracted();

        } else {
            System.out.println("\n"); // returns nothing if statement is true
        }

        
        System.out.print("Now enter a symbol for operation (/, -, +, *): ");
        char symbol = scan.next().charAt(0); // reads the math symbol input from user
        scan.close(); // close-out scanner
        
        //below are variables for math calculations
        double subtract = numOne - numTwo;
        double add = numOne + numTwo;
        double multiply = numOne * numTwo;
        double divide = numOne / numTwo;
        

        switch (symbol) { // switch expression execution determined by user input

            case '-': 
                System.out.println("Your evaluation: "+numOne+" - "+numTwo+" = "+subtract);
                break;

            case '+': 
                System.out.println("Your evaluation: "+numOne+" + "+numTwo+" = "+add);
                break;

            case '*': 
                System.out.println("Your evaluation: "+numOne+" * "+numTwo+" = "+multiply);
                break;

            case '/': 
                System.out.println("Your evaluation: "+numOne+" / "+numTwo+" = "+divide);
                break;

            default:
                System.out.print("Not a valid symbol choice.");
        }
    }

    private static void extracted() {
    } 
}