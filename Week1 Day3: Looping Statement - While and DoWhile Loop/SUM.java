import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// your code here
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		do{
			n=sc.nextInt();
           if(n!=-999) sum+=n;
		}while(n!=-999);

        System.out.println("The sum is "+sum);
	}

}
