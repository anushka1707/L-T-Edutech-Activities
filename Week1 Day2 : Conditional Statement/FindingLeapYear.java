import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if((num%4==0  )&&(num%100!=0 || num%400==0))
            System.out.println(num+" is a leap year");
            else
            System.out.println(num+" is not a leap year");

     }
}
