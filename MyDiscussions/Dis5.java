/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/17/2022)
  This program helps give the customer the type of rental car they want. */
 
import java.util.Scanner;
public class Dis5 {
    
  public static void main(String[]args) {

    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Welcome to the Resort!");
      System.out.print("\n");

      System.out.println("How many rental cars do you need? "); //initialization
      int rentals = scan.nextInt();
      scan.nextLine();

      for(rentals = 0; rentals <= 1; rentals++) { //for-loop statement

        System.out.print("Do you want a sedan or an suv? "); //condition/ update
        String carType = scan.nextLine();
        
        System.out.print("Do you want a manual or automatic? ");
        String trans = scan.nextLine();
        
        System.out.println("Your "+trans+" "+carType+ " will be ready shortly.");
        System.out.print("\n");
      }
      scan.close();
    }
  }  
}
