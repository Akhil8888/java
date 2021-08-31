package sumfunction;

import java.util.Scanner;

public class sum {
	public static void main(String a[])
	{
		sums object1=new sums();
		sums object2=new sums();
		Scanner number=new Scanner(System.in);
		System.out.println("enetr two numbers");
		int num1=number.nextInt();
		int num2=number.nextInt();
		int num3=number.nextInt();
		int num4=number.nextInt();
		
		object1.sum(num1,num2);
		object2.sum(num3,num4);
		
	}

}
