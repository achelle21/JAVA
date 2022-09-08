/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (04/12/2022)

This program will calculate the total XP for a Gamer and it will include the bonuses
that were obtained at each level. The program will output Gamer's Name, XP for each level,
and Engagement Score. */

import java.util.Scanner;
public class Asgn3 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Calculate your Gamer XP Score!");
        System.out.println("\n");

        while(true) { // while loop condition
            System.out.print("Woulld you like to enter Gamer's information? Enter yes or no: "); 
            String gamerChoice = scan.nextLine(); // variable for yes or no choice

            
            if(gamerChoice.equals("yes")) { // while loop update
                System.out.print("Enter gamer's name: ");
                String gamerTag = scan.nextLine(); // user's name variable
                System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES: ");
                String lvlScores[] = scan.nextLine().split(" "); // array for each levels XP scores
  
                // below calculates the total of all the XP scores
                int xpScoresTtl = (int)(Integer.parseInt(lvlScores[0]) + Integer.parseInt(lvlScores[0]) * 0.2 + Integer.parseInt(lvlScores[1]) + Integer.parseInt(lvlScores[1]) * 0.3 + 
                    Integer.parseInt(lvlScores[2]) + Integer.parseInt(lvlScores[2]) * 0.5 + Integer.parseInt(lvlScores[3]) + Integer.parseInt(lvlScores[0]) * 0.6);
                System.out.println();

                // below is the output of the name with the scores
                System.out.println("Gamer Name: " + gamerTag + " L1 = " + lvlScores[0] + " L2 = " + lvlScores[1] + " L3 = " + lvlScores[2] + 
                    " ES = " + lvlScores[3]);
                System.out.println();
  
                System.out.println("Your total XP score with bonuses: " + xpScoresTtl);
                System.out.println("\n");
            }

            else if(gamerChoice.equals("no")) {
                System.out.print("You chose not to enter gamer's information.");
                System.out.println();
                System.out.println("\n");
                break;
                }
        
        }scan.close();
    } 
}
  


    

