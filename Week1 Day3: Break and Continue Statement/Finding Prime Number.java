import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2,flag=0;
		while(i<=num/2){
			if(num%i==0) {
				flag=1;
				break;
	    	}
			i++;
		}
		if(flag==1)
		System.out.println("Not prime");
		else
		System.out.println(" prime");
	}

}
