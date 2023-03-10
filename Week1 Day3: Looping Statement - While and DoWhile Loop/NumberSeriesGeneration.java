import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Range :");
            int n=sc.nextInt();
            int m=sc.nextInt();
            while(n<=m){
                if(n%2==0 && n%3!=0 && n%5!=0){
                     System.out.print(n+" ");
                }
                n++;
            }
        
     }
}
