import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter n");
            int n=sc.nextInt();
            System.out.println("Enter m");
            int  m=sc.nextInt();
            int i=1;
            System.out.println("The multiplication table of "+n+" is" );
            while(i<=m){
                System.out.print(i+"*"+n+"="+(i*n));
                System.out.print("\n");
                i++;
            }
        
     }
}
