import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
             int sum=a+b+c;

             if(sum!=180)
             System.out.println("Not a Triangle");
             else if(a!=b && b!=c  &&(a!=90 && b!=90 && c!=90))
             System.out.println("Triangle is not special");
             else if(a==b && b==c)
             System.out.println("Triangle is equilateral");
             else if(a!=b && b!=c  &&(a==90 || b==90 || c==90))
             System.out.println("Triangle is right");
             else if((a==b || b==c) && (a!=90 && b!=90 && c!=90))
             System.out.println("Triangle is isosceles");
             else if((a==b || b==c) && (a==90 || b==90 || c==90))
             System.out.println("Triangle is right isosceles");

     }
}
