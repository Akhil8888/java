package symmetricLAB;

import java.util.Scanner;

public class Symmetric {
	public  static void  main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of  rows and columns");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int flag=0;
		int a[][]=new int[row][column];
		if (row==column)
		{
		System.out.println("Enter the elements in matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					flag =flag+1;
					break;
				}
			}}
		if (flag==0) {
			System.out.println("Symmetric matrix ::");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("   "+a[i][j]+"   ");
			}
			System.out.println(" ");
		}	
		
	}
		else
		{
			System.out.println("Not symmetric");
		}}
		else
		{
			System.out.println("Not symmetric");
		}
			
}
	}
