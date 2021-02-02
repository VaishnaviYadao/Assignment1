package Day1;
import java.util.Scanner;

public class Floydtriangle {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		
		int rows, i,j;
		sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		rows=sc.nextInt();
		System.out.println("Printing Floyd Triangle");
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=i; j++) 
			{
				
			System.out.format("*");
			
			}
			
			System.out.println("");
		}
		
		
	}

}
