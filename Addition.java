import java.util.Scanner;

public class Addition {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		int b[][]=new int[row][column];
		int c[][]=new int[row][column];
		System.out.println("enter the element in first matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<row;i++)
			{ 
				for(int j=0;j<column;j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
			System.out.println("Sum of matrix is:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print("     ");
					System.out.print(c[i][j]+" ");
				}
				System.out.println(" ");
			}
		
		
	}

}
