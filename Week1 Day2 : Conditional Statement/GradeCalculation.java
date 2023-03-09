import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int Marks=sc.nextInt();
		if(Marks <0 ||  Marks>100)
		System.out.println("Invalid Input");
		else if (Marks==100)
		System.out.println("The student obtained a S grade");
		else if(Marks>=90 && Marks<100)
		System.out.println("The student obtained a A grade");
		else if(Marks>=80 && Marks<90)
		System.out.println("The student obtained a B grade");
		else if(Marks>=70 && Marks<80)
		System.out.println("The student obtained a C grade");
		else if(Marks>=60 && Marks<70)
		System.out.println("The student obtained a D grade");
		else if(Marks>=50 && Marks<60)
		System.out.println("The student obtained a E grade");
		else if(Marks<50)
		System.out.println("The student obtained a F grade");

	}

}
