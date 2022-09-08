/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/22/2022)
  This program will calculate the total spent on shoes after receiving user input while using the
  created method. */

  import java.util.Scanner;
  class Dis6 {

    public static int addNumbers(int a, int b) { // method  with parameters
        int sum = a + b; 
       return sum; // return statement
    }
    public static void  main(String[]args) { // main method
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How much is your first pair of shoes? ");
        int pairOne = scan.nextInt(); // read user input
        System.out.println("How much is your second pair of shoes?"); 
        int pairTwo = scan.nextInt(); // read user input
      
        // statement calling method
        System.out.println("Your total spent on shoes today is $" +addNumbers(pairOne, pairTwo));

        scan.close();
    } 
  }