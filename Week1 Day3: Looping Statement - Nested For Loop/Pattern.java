import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           for(int i=1;i<=n;i++){
               for(int j=i;j<=n;j++){
                     System.out.print(j+" ");
               }
               System.out.print("\n");
           }
        
     }
}
