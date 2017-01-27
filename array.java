package array;

import java.util.Scanner;

public class driver 
{

	public static void main(String[] args) 
	{
		int[][] arr = new int[4][3];           // CREATED A 4x3 ARRAY (4 = ROW 3 = COLOUMN)
		Scanner num = new Scanner(System.in); 
		for(int row=0; row<4; row++)           //ROW MANIPULATION LOOP
		{
			for(int col=0; col<=2; col++)      //COLOUMN MANIPULATION LOOP
			{
				System.out.println("Enter a number: ");
				arr[row][col] = num.nextInt();	//ADDS NUMBER TO ARRAY (ROW 0 COLOUMN 0 = 4)
			}
		}
		
		System.out.println("\nOUTPUT 1");
		 for(int row=0; row<4; row++) 
		 {
		       for(int col=0; col<=2; col++)
		       {
		    	   if(row==3 && col==2){
		    		   System.out.print(arr[row][col]);
		    	   }
		    	   else
		    	   {
		    		   System.out.print(arr[row][col] + ", ");
		    	   }
		       }
		    }
		
		 System.out.println("\n\nOUTPUT 2");
		 for(int row=0; row<4; row++) 
		 {
			 for(int col=0; col<=2; col++)
		     {
				 System.out.print(arr[row][col] + "\t");
		     }
		     System.out.println();
		  }
	}
}
