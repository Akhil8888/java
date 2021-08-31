import java.util.Scanner;

public class Multi {
public static  void main (String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements");
	for (int i=0;i<=n;i++)
	{
		 a[i]=sc.nextInt();
	}
	System.out.println("Enter the element to search ");
	
}
}
