import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value :");
            int num=sc.nextInt();
            int sum=0,temp;
            temp=num;
            while(num!=0){
                      int n=num%10;
                      num=num/10;;
                      sum+=n;
            }
            System.out.print("Sum of digits in "+temp+" is "+sum);
        
     }
}
