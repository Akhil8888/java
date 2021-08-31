import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String str)
    {
        System.out.println(str);
    }
}
public class avg {
    public static void main(String[] args){
        try {
            int i, n;
            double sum=0;
            double average=0;
            int elem[]=new int[40];
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = sc.nextInt();
            System.out.println("Enter thee elements: ");
            for (i = 0; i < n; i++) {
                elem[i] = sc.nextInt();
            }
            for(i=0;i<n;i++) {
                if (elem[i] >= 0) {
                    sum = elem[i] + sum;
                }
                else
                    throw new MyException("Number is negative");
            }
                average = sum/n;
                System.out.print("\nAverage is " +average);
        }
        catch (MyException m) {
            System.out.println(m);
        }
    }
}
