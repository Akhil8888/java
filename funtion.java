package functongst;

import java.util.Scanner;

public class funtion {
	public static void main(String ar[])
	{
		float b;
	b=result();
	display(b);
	}
	static float result()
	{
		Scanner sc=new Scanner(System.in);
		Scanner ac=new Scanner(System.in);
		System .out.println("enetr amount to find gst");
		float num1=sc.nextFloat();
		System.out.println("enter the percentage of gst ");
		float num2=ac.nextFloat();
		float c= (num1*num2)/100;
		float b=c+num1;
		return (b);
			}
 static void  display(float b)
 {
	System.out.println("gst="+b);
 }
}
