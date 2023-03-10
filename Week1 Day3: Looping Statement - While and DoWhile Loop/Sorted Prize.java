import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		if(num<100 || num>999){
			System.out.println("no");
		}
		else{
			int a=num/100;
			int b=num/10;
			b=b%10;
			int c=num%10;
			if(b>=a && c>=b)
			System.out.println("yes");
			else if(b>=c && a>=b)
			System.out.println("yes");
            else
			System.out.println("no");
		}
	}

}
