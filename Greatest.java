package greatestof3LAB;

import java.util.Scanner;

public class Greatest {
public static void main(String args[]) {
	System.out.println("Enter the 3 numbers to check");
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	if(a>b&a>c)
	{
		System.out.println(+a+" is greater");
	}
	else if(b>c)
	{
		System.out.println(+b+" is greater");
	}
	else
	{
		System.out.println(+c+" is greater ");
	}                            
}
}
