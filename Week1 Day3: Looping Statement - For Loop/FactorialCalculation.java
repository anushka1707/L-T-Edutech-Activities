import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1;
        for(int i=2;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
     }
}
