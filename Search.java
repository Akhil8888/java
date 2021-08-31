package searchinArLAB;

import java.util.Scanner;

public class Search {
	public static  void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in array");
		int lim=sc.nextInt();
		int a[]=new int[lim];
		System.out.println("enter the elements in array");
		for (int i=0;i<lim;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elemnt to search");
	    int c=sc.nextInt();
	    int flag=0;
	    for(int i=0;i<lim;i++)
	    {
	    	if(a[i]==c)
	    	{
	    		i=i+1;
	    		System.out.println("Element " +c+" found at "+i+" position");
	    	   flag= flag+1;
	    		break;
	    	}
	    	
	    }
	    if (flag==0)
    	{
    		System.out.println("Element "+c+" not found");
   
    	}
		
	}

}
