import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                   for(int j=1;j<=n;j++){
                       if(i==(n/2)+1 && j==(n/2)+1)
                          System.out.print("* ");
                        else
                          System.out.print("~ ");  
                   }
                   System.out.print("\n");
            }
        
     }
}
