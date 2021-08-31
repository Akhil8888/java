package trial;

import java.util.Scanner;
public class Tria
{


    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in) ;
    System.out.print("enter radius:");
    System.out.println("enter the second circle to find radious");
    Double b=sc.nextDouble();
      Double a=sc.nextDouble();
     Sample a1=new Sample();
     a1.radious(a);
     a1.radious(b);
    }
   
}
