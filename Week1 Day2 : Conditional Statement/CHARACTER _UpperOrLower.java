import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().charAt(0);
            if(ch>='A' && ch<='Z')
             System.out.println(ch+" is uppercase letter");
             else if(ch>='a' && ch<='z')
             System.out.println(ch+" is lowercase letter");
             else
             System.out.println(ch+" is neither an uppercase or lowercase letter");

     }
}
