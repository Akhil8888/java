
	import java.util.Scanner;

	interface bill {
	    float calcul();
	    void in();
	    void op();
	}
	class bills implements bill{
	    float price, net = 0;
	    int prod_id,qty;
	    String name;
	    Scanner reader = new Scanner(System.in);

	    public void in(){
	        System.out.print("\nEnter product id: ");
	        prod_id = reader.nextInt();
	        System.out.print("Enter product name: ");
	        name = reader.next();
	        System.out.print("Enter product quantity: ");
	        qty = reader.nextInt();
	        System.out.print("Enter price: ");
	        price = reader.nextFloat();
	    }
	    public void op(){
	        float tot=qty*price;
	        System.out.print("\n" +prod_id+"             "+name+"                 "+qty+"                 "+price+"              "+tot);
	    }

	    public float calcul(){
	        net=qty*price;
	        return net;
	    }
	}


