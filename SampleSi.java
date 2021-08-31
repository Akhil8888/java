import java.util.Scanner;

public class SampleSi {
	 public static void main(String args[]){
		 
		  int n;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number of Employes:");
		  n=sc.nextInt();
		  Teacher t[]=new Teacher[n];

		  for(int i=0;i<n;i++)
		  {
		  t[i]=new Teacher();
		  t[i].emp();
		  t[i].ter();
		  }
		  System.out.println("*****DETAILS****");
		  for(int i=0;i<n;i++)
		  {
		 
		  t[i].display();
		  System.out.println("=========");
		 
		  }
		 
		
		   } 	   

		}
