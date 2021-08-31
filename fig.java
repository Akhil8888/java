package graphics;

import java.util.Scanner;

interface arith1
{  
        void rect(int a, int b);  
        void cir(double a);  
        void sqr(int a);  
        void tri(int a,int b);
        void display();  
    }  
    class area1 implements arith1{  
        int x,  z;
        double y,r;
       
       
        public void rect(int a, int b) {  
           
            x = a * b;  
        }  
       public void cir(double r) {  
           
            y = 3.14*r*r;  
        }  
       public void sqr(int a) {  
           
            z = a*a;  
        }  
       public void tri(int a,int b) {  
           
           r= 0.5*a*b;  
       }  
       
        public void display() {  
            System.out.println("Area of Rectangle:" + x);  
            System.out.println("Area of Circle:" + y);  
            System.out.println("Area of Square:" + z);  
            System.out.println("Area of Triangle:" + r);  
           
        }  
    }  
    class fig {  
       public static void main(String[] args) {  
         area1 obj = new area1();
            Scanner s=new Scanner(System.in);
            int g, h,m,t1,t2;
             double n;  
             System.out.println ("__________ENTER VALUES__________");  
            System.out.println ("Enter the length:");  
            g = s.nextInt();  
            System.out.println("Enter the breadth :");  
            h =s.nextInt();
            System.out.println("Enter the  radius :");  
            n =s.nextDouble();
            System.out.println("Enter the side of square :");  
            m =s.nextInt();
            System.out.println("Enter the  Triangle Height :");  
            t1 =s.nextInt();
            System.out.println("Enter the Triangle base :");  
            t2 =s.nextInt();
            obj.rect(g, h);  
            obj.cir(n);  
            obj.sqr(m);  
           obj.tri(t1, t2);
            obj.display();  
             
        }  
    }  


