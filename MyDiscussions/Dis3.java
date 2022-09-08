/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/02/2022)
 This program gets users favorite number and decides if it is the same as mine, which is 21. */

 import java.util.Scanner; // import the Scanner library
 public class Dis3 {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your favorite number? "); // created an object (scan) to read user input
        int fav = scan.nextInt(); // reads user input for favorite number
        int myFavNum = 21; // my favorite number, used to compare
        int newNum = myFavNum + fav; // addition of the two numbers
        scan.close();
        // below compares the user input to my favorite number 21
        if (fav == myFavNum) {
            System.out.println("That's my favorite number too!");
        } 

        else {
            System.out.println("Oh, your favorite number is "+fav+" my favorite number is "+myFavNum+".");
            System.out.println("Our numbers together is "+newNum+".");
        }
    }
 } 