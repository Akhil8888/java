
public class Complexadd {
		public static void main(String[] args){
		  Complex complex1=new Complex();
		  Complex complex2=new Complex();
		  Complex result=new Complex();
		  System.out.println("enter the first complex number:\n");
		  complex1.input();
		  System.out.println("enter the second complex number:\n");  
		  complex2.input();


		   result=complex1.add(complex2);
		result.output();
		}
		}
