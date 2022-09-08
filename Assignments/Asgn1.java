/* Name: Evans, Amber 	CMIS 141/7380 	Date: (03/27/2022)
 This program will calculate the total cost before and after an applied discount as well as display all
 information being asked of the user*/ 
import java.util.Scanner; 
public class Asgn1 {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your 6 digit customer ID: ");
        int custId = scan.nextInt(); // customer id

        System.out.print("Enter price of item being purchased: $");
        double itemPrice = scan.nextDouble(); // price of product

        System.out.print("How many are being purchased? ");
        int itemQuant = scan.nextInt(); // the amount being purchased

        System.out.print("Enter the discount that goes with the item in decimal format: ");
        double discount = scan.nextDouble(); // discount chosen by user
        scan.nextLine(); // allows nextDouble() to consume this line, so line24 wont be skipped

        System.out.print("Enter product description: ");
        String itemDescr = scan.nextLine(); // product description 
        System.out.println("\n");
        scan.close();

        double total = itemPrice * itemQuant; // calculates total cost before discount is applied
        double discAmnt = total * discount; // calculates amount saved from discount
        double aftDiscPrice = total - discAmnt; // price after discount is applied 

        System.out.println("Your customer ID: "+custId);
        System.out.println("The item being purchased: "+itemDescr);
        System.out.println("The price of item: $"+itemPrice);
        System.out.println("The amount purchased: "+itemQuant);
        System.out.println("Your total before discount: $"+total);
        
        System.out.println("\n");
        System.out.println("Your discount: "+discount);
        System.out.println("Your price after discount: $"+aftDiscPrice);

    }

    
}

