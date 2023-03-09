import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws Exception{ 

//		Fill your code
    Scanner sc= new Scanner(System.in);
	float brand,travel,food,logic;
	System.out.println("Enter branding expenses");
	brand=sc.nextFloat();
	System.out.println("Enter travel expenses");
	travel=sc.nextFloat();
	System.out.println("Enter food expenses");
	food=sc.nextFloat();
	System.out.println("Enter logistics expenses");
	logic=sc.nextFloat();
	float total=brand+travel+food+logic;
	System.out.printf("Total expenses: Rs.%.2f\n",(brand+travel+food+logic));
	System.out.printf("Branding expenses percentage: %.2f%%\n",((brand/total)*100));
	System.out.printf("Travel expenses percentage: %.2f%%\n",((travel/total)*100));
	System.out.printf("Food expenses percentage: %.2f%%\n",((food/total)*100));
	System.out.printf("Logistics expenses percentage: %.2f%%\n",((logic/total)*100));
}
}
