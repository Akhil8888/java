import java.util.Scanner;
import java.lang.Thread;
class A implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        int n , a= 0,b= 1,c;
        System.out.println("Enter the limit of numbers:");
         n=sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(a + ", ");

      c = a+ b;
      a= b;
      b = c;
    }
    }
}
class B implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  starting limit:"); 
        int n1=sc.nextInt();
        System.out.println("Enter  ending limit:"); 
        int n2=sc.nextInt();
        System.out.println("Even numbers are:"); 
        for(int i=n1;i<=n2;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}
public class ThreadRunnable {

    
    public static void main(String[] args) {
        A obj1 =new A();
        Thread one=new Thread(obj1);
        
        
        B obj2 =new B();
        Thread two=new Thread(obj2);
        
        
            one.start();
            two.start();
    }
    
}