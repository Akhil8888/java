package factorialLAB;

import java.util.Scanner;

public class Fact {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in );
System.out.println("Enter number to check the Factorial");
int a=sc.nextInt();
int i;
int fact=1;
for(i=1;i<=a;i++)
{
	fact=fact*i;
	}
System.out.println("Factorial of " +a+" = "+fact);
}
}
