import java .util.Scanner;
public class Main{
    public static void main(String[] args){    	     
           //Fill your code
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter any number :");
           int Num=sc.nextInt();
           if(Num%2==0)
           System.out.println(Num+" is even.");
           else
           System.out.println(Num+" is odd.");

    }
}
