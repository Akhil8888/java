import java.util.Scanner;
public class Product {
	double pcode;
	String pname;
	double price;
	Scanner sc=new Scanner(System.in);
	void getdata() {
		System.out.println("Enter the product code");
		pcode=sc.nextDouble();
		System.out.println("Enter the product name");
		pname=sc.next();
		System.out.println("Enter the product price");
		price=sc.nextDouble();
	}
	Product max(Product s1, Product s2 )
	{
		if(s1.price<s2.price&s1.price<this.price)
		{
			return s1;
		}
		else if(s2.price<this.price)
		{
			return s2;
		}
		else
		{
		
		return this;      
		}
		
	}
	void display()
	{
		System.out.println("product code :" +pcode);
		System.out.println(" product name: "+pname);
		System.out.println(" product price: "+price);
		
	}
	
	

}



