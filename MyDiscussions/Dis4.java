/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/11/2022)
  This program ask for aircraft number, the amount of fuel needed per aircraft
   and calculates the price. */

import java.util.Scanner;
public class Dis4 {

  public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int gasPrice = 25; // the price of gas per gallon 

        System.out.println("How many planes flew today? "); //initialization
        int amntPlanes = scan.nextInt(); // the number of planes that flew

        while (amntPlanes > 0) { //condition
          amntPlanes--; // update
          System.out.println("What is the planes side number? ");
          int planeNum = scan.nextInt(); // aircraft side number
          System.out.println("How many gallons of gas is needed? ");
          int gasGals = scan.nextInt(); // the amount of fuel in gallons
            
          if (gasGals > 0) { 
            int ttlGasCost = gasPrice * gasGals; // calculates the cost of fuel per gallons
            System.out.println("The aircraft needing servicing is "+planeNum);
            System.out.println("The total cost of fuel for this aircraft is: $"+ttlGasCost);
            System.out.println("\n");
           }

          else {
              System.out.print("This plane doesn't need servicing. ");
              System.out.println("\n");
              
            }
        } scan.close();
    }
}
