import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            int Num=sc.nextInt();
            if(Num%7==0 &&  Num%3==0)
            System.out.println(Num+" is divisible by both 7 and 3");
            else
            System.out.println(Num+" is not divisible by both 7 and 3");
            

        
     }
}
