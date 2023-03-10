import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp!=0){
            int n=temp%10;
            temp=temp/10;
            rev=rev*10+n;
        }
        System.out.print("Reverse of the number is "+rev);
     }
}
