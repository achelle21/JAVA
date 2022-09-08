/**Hunter Ganung
 * CMIS 141
 * 4/26/2022*/

import java.util.Scanner;

public class Discussion6 {
	
	public static double calculateCPTicket(double cost, double QTY) {
		return cost/QTY;
	}
	// Amber: below is my method
	public static double sevenDayTicketCost(double a, double b){
		double total = (a/b) * 7; // Amber: will return the total for 7 days
		return total;
	}

	public static void main(String[] args) {

		//setup scanners
		Scanner scandub = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);
		
		//define variables
		String Ticket; //TICKET NAME
		double Cost; //total movie ticket cost
		double quantity; //how many tickets
		double PPT; //price per ticket
		
		System.out.print("What movie ticket did you buy? ");
		Ticket = scanstr.nextLine();

		System.out.print("Please enter the total price paid: ");
		Cost = scandub.nextDouble();
		
		System.out.print("Please enter the total mount of tickets you purchased ");
		quantity = scandub.nextDouble();

		PPT = calculateCPTicket(Cost, quantity);
		
		//display results
		System.out.println();
		System.out.printf("You paid $%.2f per ticket for your " + Ticket, PPT);

		// Amber: below is my added statement calling my method
		System.out.println();
		System.out.println("If everyone went to see this show for seven days, their total would be $" +sevenDayTicketCost(Cost, quantity));
		
		scandub.close();
		scanstr.close();
	}
};
