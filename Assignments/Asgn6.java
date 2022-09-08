/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (05/03/2022)
   This program will take the team names and the team scores and put them in separte arrays and print the values
   as well as show which team scored the highest and which team scored the lowest. */

   import java.util.Scanner;
public class Asgn6 {

    // method to determine the  lowest team score
    public static int lowestValue(int[] teamScores) {
        int min = teamScores[0], value = 0;
        int length = teamScores.length;
        for(int i = 1; i < length; i++) {
            if(min > teamScores[i]) {
                min = teamScores[i];
                value = i;
            }
        }
        return value;
    }
    // method to determine the highest team score
    public static int highestValue(int[] teamScores) {
        int max = teamScores[0], value = 0;
        int length = teamScores.length;
        for(int i = 1; i < length; i++) {
            if(max < teamScores[i]) {
                max = teamScores[i];
                value = i;
            }
        }
        return value;
    }
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of teams: ");
        int teamAmnt = scan.nextInt(); // input for the amount of teams

        String[] teamNames = new String[teamAmnt]; // array for team names
        int[] teamScores = new int[teamAmnt]; // array for team scores
        
        // below is the for-loop to store the team names and scores into the two arrays.
        for(int i = 0; i < teamAmnt; i++) {
            scan.nextLine();
            
            System.out.println("Team "+(i+1));
            System.out.print("Enter team name: ");
            teamNames[i] = scan.nextLine();
    
            System.out.print("Enter team score (400-1000): ");
            teamScores[i] = scan.nextInt();
            
        }  
        // displays each teams name and their score
        for(int i = 0; i < teamAmnt; i++) {
            System.out.println("Name: "+teamNames[i]+ " Score: "+teamScores[i]);
        }
        // displays the which team scored the highest and the lowest
        System.out.println("The highest score is "+teamScores[highestValue(teamScores)]+" scored by team "+teamNames[highestValue(teamScores)]);
        System.out.println("The lowest score is "+teamScores[lowestValue(teamScores)]+" scored by team "+teamNames[lowestValue(teamScores)]);
        scan.close();
    }
}

