


import java.util.Scanner;
public class Asgn4_1 {    
	public static void main(String[] args) 
	{
		int numRows, numCols, firstNum, x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your first number? ");
        firstNum = scan.nextInt();

		System.out.print(" Please Enter Number of Rows : ");
		numRows = scan.nextInt();	
		
		System.out.print(" Please Enter Number of Columns : ");
		numCols = scan.nextInt();		
			
		for(x = 1; x <= numRows; x++) {
			for(y = 1; y <= numCols; y++) {
                if(firstNum <= 0) {
                    firstNum++;
                } 
                else {
                    System.out.print("\n");
                } 
                System.out.println(firstNum);
			}
		
		}	
	}
}