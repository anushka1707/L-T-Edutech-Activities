import java.util.Scanner;
public class Main{
    public static void main(String[] args){    	     
           //Fill your code
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the two numbers");
           int a=sc.nextInt();
           int b=sc.nextInt();
           b=a+b;
           a=b-a;
           b=b-a;
           System.out.println("The two values after swapping are");
           System.out.println(a);
           System.out.println(b);

    }
}
