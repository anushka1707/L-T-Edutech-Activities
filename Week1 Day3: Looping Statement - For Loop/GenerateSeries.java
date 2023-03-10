
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = 4,j=8;
      System.out.print(num + " ");
      for (int i = 1; i < n; i++) {
      num=num*j;
      System.out.print(num + " ");
      j=j/2;
      }
 }
}
