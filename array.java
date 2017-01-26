package array;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		Scanner num = new Scanner(System.in);  // Reading from System.in
	
		
		for(int i=0;i<=12;i++)
		{
			for(int j=i;j<i;j++){
				System.out.println("Enter a number: ");
				int n = num.nextInt();
				arr[i][j] = n;
				
			}
		}
	}
}
