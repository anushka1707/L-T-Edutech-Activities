import java.util.Scanner;
public class Main{
    public static void main(String[] args){    	     
           //Fill your code
           Scanner sc= new Scanner(System.in);
           System.out.println("Cost of item:");
           int Cost=sc.nextInt();
           System.out.println("Number of items:");
           int Num=sc.nextInt();
           System.out.println("Total cost is Rs."+(Cost*Num));
    }
}
