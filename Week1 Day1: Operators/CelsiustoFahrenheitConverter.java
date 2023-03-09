import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            System.out.println("Temperature in Celsius:");
            float temp=sc.nextFloat();
           float ftemp= (temp*9/5)+32;
           System.out.printf("Temperature in Fahrenheit is %.1fF",ftemp);
        
     }
}
