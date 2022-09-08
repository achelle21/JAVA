/* Hunter Ganung
 * CMIS 141 
 * April 12th, 2022
 */
import java.util.*;

public class HunterGanungDisc4 {

	public static void main(String[] args) {
		
		int inputNumber;
		int sum = 0;
		int count = 0;
		double average; 
		
		
		Scanner stdin = new Scanner(System.in);
		// Amber update: below is the do statement I added to this program 
		do {
			System.out.print("Enter the your lunch today by the calories per food item: ");
			inputNumber = stdin.nextInt();
			sum+= inputNumber;
			count++;
			System.out.print("Enter another calorie qty for any other food item, or 0 if there was no other food:");
			inputNumber = stdin.nextInt();

			if (count==0) {
				System.out.println("You didn't have anything to eat for lunch?!");
				}

			else {
					average = ((double)sum) * 3;
					System.out.println();
					System.out.println("You consumed a "+sum+" calorie lunch with just "+count+" food items!!");
					System.out.println("So, theoretically you eat approximately "+average+" calories per day if your meals were consistant.");
				}
		}
		
		while (inputNumber != 0); 
		stdin.close();	
	}
}
