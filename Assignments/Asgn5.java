/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/26/2022)
   This program will prompt the user which action they want to take, and give them the appropriate response
   with the use of methods. */

import java.util.Scanner;

public class Asgn5 {
    
    // method to convert cubic feet to bushels.
    public static double cubicToBushels(double cubicFeet) {
        return cubicFeet * 0.803564; // the conversion formula
    }

    // method to convert miles to kilometers
    public static double milesToKm(double miles) {
        return miles *  1.60934; // conversion formula
    }

    // method to determine which level of honors    
    public static String honorsTitle(double gpa) {

        if (gpa >= 3.5 && gpa <= 3.7) {
            return "Cum Laude";
        }
        if (gpa >= 3.8 && gpa <= 3.9) {
            return "Magna Cum Laude";
        }
        if (gpa >= 4.0) {
            return "Summa Cum Laude";
        }
        return null;
    }

    public static void main(String[] args) { // main method

        Scanner scan = new Scanner(System.in);
        char choice; // used to store single character of menu choice

        do { // do loop for the menu choices
            System.out.println("""
                        (a) Convert cubic feet to U.S. bushels
                        (b) Convert miles to kilometers
                        (c) Determine graduation with honors title
                        (d) Exit program""");

            System.out.print("Enter your selection: \n");
            choice = scan.next().charAt(0); // reads the character the user inputs


            switch (choice) { // switch statement for menu choices
                case 'a' -> {
                    System.out.print("Enter cubic feet: ");
                    double cubic = scan.nextDouble();
                    System.out.println(cubic + " cubic feet is equal to " + cubicToBushels(cubic) + 
                    " U.S. bushel \n");
                    }
                case 'b' -> {
                    System.out.print("Enter miles: ");
                    double miles = scan.nextDouble();
                    System.out.println(miles + " miles is equal to " + milesToKm(miles) + " km \n");
                }
                case 'c' -> {
                    System.out.print("Enter GPA: ");
                    double gpa = scan.nextDouble();
                    System.out.println("Honors title: " + honorsTitle(gpa)+"\n");
                }
                case 'd' -> {
                    System.out.print("Good Bye!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please choose a valid selection \n");
                }
            }
        }
        while (true);  // while to accompany the do statement
    }
}

