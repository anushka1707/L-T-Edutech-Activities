import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the range:");
            int n=sc.nextInt();
            int a=0;
            int b=1;
            int temp=0;
            System.out.println("Fibonacci series:");
            System.out.println(a);
            System.out.println(b);
           for(int i=2;i<n;i++){
                temp=a+b;
                System.out.println(temp);
                a=b;
                b=temp;
            }
        
     }
}
