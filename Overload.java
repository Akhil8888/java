
public class Overload {
	public void area(float s)
	{
double area=s*s;
System.out.println("Area of Square= "+area);
		
	}
public void area(float x, float y)
{
	double area=x*y;
	System.out.println("Area of rectangle = "+area);
	
	}
public void area(double r) {

	double area=3.14*r*r;
	System.out.println("Area of Circle = "+area);
	
}
}
