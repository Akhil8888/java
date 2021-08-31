import java.util.Date;
import java.util.Scanner;

public class interfacebill {

	    public static void main(String args[]) {
	        Scanner reader = new Scanner(System.in);
	        int i,n,order_no;
	        System.out.print("Enter order number: ");
	        order_no = reader.nextInt();
	        Date date=new Date();
	        System.out.print(" Enter number of products: ");
	        n = reader.nextInt();
	        bills c = new bills();
	        bills b[] = new bills[n];
	        for (i = 0; i < n; i++) {
	            b[i] = new bills();
	            b[i].in();
	        }
	        System.out.print(" \n\nORDER NUMBER: " +order_no);
	        System.out.print(" \nDATE: " +date.toString());
	        System.out.print("\nPRODUCT ID        NAME        QUANTITY         UNIT PRICE        TOTAL");
	        System.out.print("\n---------------------------------------------------------------------------");
	        for (i = 0; i < n; i++) {
	            b[i].op();
	        }
	        System.out.print("\n--------------------------------------------------------------------------");
	        float totalnet = 0;
	        for (i = 0; i < n; i++) {
	            b[i].calcul();
	            totalnet = totalnet + b[i].net;
	        }
	        if(i==n) {
	            System.out.print("\nNET AMOUNT: "+totalnet);
	        }
	    }
	}
