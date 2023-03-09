import java.util.Scanner;
import java.io.*;
import java.text.*;
public class Main{
    public static void main(String args[]) throws IOException{
        // fill the code
        Scanner sc=new Scanner(System.in);
        System.out.println("Richter Magnitude:");
        float Magnitude=sc.nextFloat();
        if(Magnitude<=2.4)
        System.out.println("Micro");
        else if (Magnitude>=2.5 && Magnitude<=5.4)
        System.out.println("Light");
        else if (Magnitude>=5.5 && Magnitude<=6.0)
        System.out.println("Moderate");
        else if (Magnitude>=6.1 && Magnitude<=6.9)
        System.out.println("Strong");
        else if (Magnitude>=7.0 && Magnitude<=7.9)
        System.out.println("Major");
        else if (Magnitude>=8.0)
        System.out.println("Great");


    }
}
