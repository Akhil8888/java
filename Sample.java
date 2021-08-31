package trial;
public class Sample {

	double r;
	void radious(Double r)
	{
		double radious,cir;
		radious= 2*3.14*r;
		
		cir= 3.14*r*r;
   display(radious,cir);		
}
	
void display(double a, double b)
{
	
System.out.println("area= "+a+" circum= "+b);
}
}
