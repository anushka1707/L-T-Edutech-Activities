import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            int num;
                do{
                System.out.println("Type a value between 0 and 20 ");
                 num=sc.nextInt();
            
                }  while (num<0 || num>20);

                System.out.println("The final value is "+(num+17));
        
     }
}
