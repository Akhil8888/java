package Arithemetic;
import java.util.Scanner;

interface arith
{  
        void add(int a, int b);  
        void sub(int a, int b);  
        void mul(int a, int b);  
        void divi(double a, double b);  
        void display();  
    }  
    class math implements arith{  
        int a1, a2, a3;  
        double d;  
        public void add(int a, int b) {  
           
            a1 = a + b;  
        }  
       public void sub(int a, int b) {  
           
            a2 = a - b;  
        }  
       public void mul(int a, int b) {  
           
            a3= a * b;  
        }  
        public void divi(double a, double b) {  
           
            d = a / b;  
        }  
        public void display() {  
            System.out.println("Addition :" + a1);  
            System.out.println("Subtraction :" + a2);  
            System.out.println("Multiplication :" + a3);  
            System.out.println("Division :" + d);  
        }  
    }  
  
public class Operators {public static void main(String[] args) {  
    math obj = new math();
    Scanner s=new Scanner(System.in);
    int m, n;  
    System.out.println ("Enter the first Number :");  
    m = s.nextInt();  
    System.out.println("Enter the second Number :");  
    n =s.nextInt();  
    obj.add(m, n);  
    obj.sub(m, n);  
    obj.mul(m, n);  
    obj.divi(m, n);  
    obj.display();  
     
}  
}
