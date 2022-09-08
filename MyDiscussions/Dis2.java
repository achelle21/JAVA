//Name: |Evans, Amber 	CMIS 141/7380 	Date: (03/26/2022)
// This program calculates the total time exercised for the month of march. 

import java.util.Scanner; // import the Scanner library
public class Dis2 {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in); // created an object (scan) to read user input
        
        System.out.print("How many days did you workout this week? "); 
        int wkoutDays = scan.nextInt(); // variable (wkoutDays) reads user input for days excrcised 
        System.out.print("How many minutes is your workout each day? ");
        int wkoutMins = scan.nextInt(); // variable (wkoutMins) reads user input for minutes excrcised 
        
        int mar = 31; // number of days in march
        int totalWkMins = wkoutDays * wkoutMins; // variable (totalMins) for the product of users inputs 
        int totalMoMins = wkoutMins * mar; // variable (totalMoMins) for the product of minutes exercised for march  

        System.out.println("Good Job!! You have exercised "+totalWkMins+" minutes this week!");
        System.out.println("If you workout "+wkoutMins+" minutes everyday for the month of March, you will exercise "+totalMoMins+" minutes.");
        scan.close();
        
    }
}