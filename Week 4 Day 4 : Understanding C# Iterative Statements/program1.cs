using System;

public class Program {
  public static void Main() {
    Console.WriteLine("Enter the value :");
    int num = int.Parse(Console.ReadLine());
    int temp=num;
    int sum = 0;
    while (temp > 0) {
      sum += temp % 10;
      temp /= 10;
    }
    Console.WriteLine($"Sum of digits in {num} is {sum}");
  }
}
