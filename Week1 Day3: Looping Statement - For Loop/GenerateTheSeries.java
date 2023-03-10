import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pr=1;
		for(int i=0;i<n;i++){
			pr=(pr*2)+1;
			System.out.print(pr+" ");
		}
	}

}
