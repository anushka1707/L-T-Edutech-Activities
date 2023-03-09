import java.util.Scanner;
public class Main{
    public static void main(String[] args){    	     
           //Fill your code
           Scanner sc= new Scanner(System.in);
           int x;
           System.out.println("Enter the total number of people");
           int Num=sc.nextInt();
           x=(2*Num)/7;
           System.out.println("Number of attendees on day 1 : "+x);
           System.out.println("Number of attendees on day 2 : "+(2*x));
           System.out.println("Number of attendees on day 3 : "+(x/2));

    }
}
