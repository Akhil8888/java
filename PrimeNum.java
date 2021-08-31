package primenumbersLAB;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 int i,j,num,c;
		 System.out.println("Enter the limit to find prime numbers");
		 num=sc.nextInt();
		 System.out.println("Prime numbers are :");    
		    
		 for(i=2;i<=num;i++)
		     {
		         c=0;
		         for(j=1;j<=i;j++)
		         {
		        	     if(i%j==0)
		        	     {
		        	         c++;
		        	     }
		         }
		         
		       if(c==2)
		       {
		             System.out.print(i+" ");
		         }
		     }
		 }}
