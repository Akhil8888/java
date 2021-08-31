import java.util.Scanner;
public class Complex {


	   
	   float real;
	   float imag;


	       Complex(){
	         real=0; imag=0;
	       }
	public void input(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter real and imaginary parts");
	   real=sc.nextFloat();
	   imag=sc.nextFloat();
	}

	public Complex add(Complex obj){
	  Complex temp=new Complex();
	  temp.real=real + obj.real;
	  temp.imag=imag + obj.imag;
	  return temp;
	}

	public void output(){
	if(imag < 0)
	{
	  System.out.print("output complex number: ");
	  System.out.println(real + " "+ imag + "i");
	}
	else
	{
	  System.out.print("output complex number: ");
	  System.out.println(real + "+" + imag + "i");
	}
	}
	}

	

