/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (05/10/2022)
   This program will prompt user for the number of customers to be loaded and then prompts for each customer's name, 
   customer id (5 digit number), and total sales, displays each customer's data, and the lowest and highest total 
   sales and displays all customers with total sales in that range*/

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMenu { 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean menuLoop = true; // create a variable
        ArrayList<Customer> list = new ArrayList<>(); // builds a list of customers

        while(menuLoop) { // while loop to pass through each option until no longer true
            System.out.println("(1.) Load customer's data");
            System.out.println("(2.) Add new customer");
            System.out.println("(3.) Display all customer's");
            System.out.println("(4.) Retrieve specific customer data");
            System.out.println("(5.) Retrieve customer's with total sales based on the range");
            System.out.println("(6.) Exit");

            int selection = Integer.parseInt(scan.nextLine()); // returns an integer that's in a string
            String name;
            int id, sales;
            boolean found = false;

            switch(selection) { // cases in the switch method for each menu selection
                
                case 1:
                    System.out.print("Enter the number of customers: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for(int i = 1;i <= n; i++){
                        System.out.println("Enter details for the customer " + i);
                        System.out.print("Enter name: ");
                        name = scan.nextLine();

                        System.out.print("Enter Id: ");
                        id = Integer.parseInt(scan.nextLine());
                        
                        System.out.print("Enter Total Sales: ");
                        sales = Integer.parseInt(scan.nextLine());
                        list.add(new Customer(name, id, sales));
                    }
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    name = scan.nextLine();
                    System.out.print("Enter customer Id: ");
                    id = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter Total sales: ");
                    sales = Integer.parseInt(scan.nextLine());
                    list.add(new Customer(name, id, sales));
                    break;

                case 3:
                    System.out.println("Displaying all the customers: ");
                    if(list.isEmpty())
                    System.out.println("No data");
                    for(Customer obj : list){
                    System.out.println(obj.toString());
                    }
                    break; 

                case 4:
                    System.out.println("Enter Id to search: ");
                    id = Integer.parseInt(scan.nextLine());
                    for(Customer obj : list) {
                        if(obj.getId() == id) {
                            System.out.println(obj.toString());
                            found = true;
                            break;
                        }
                    } 
                    break; 

                case 5:
                    System.out.print("Enter lowest total sales: ");
                    int lowest = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter highest total sales: ");
                    int highest = Integer.parseInt(scan.nextLine());
                    for(Customer obj : list){
                        if(obj.getTotalSales() >= lowest && obj.getTotalSales() <= highest){
                            System.out.println(obj.toString());
                            found = true;
                        }
                    }

                    if(!found)
                        System.out.println("Not found!");
                    break;

                case 6:
                    menuLoop = false;
                break;
            }
            System.out.println("\n");
        }scan.close();
    }
}