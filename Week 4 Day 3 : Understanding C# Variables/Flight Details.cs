using System;

class Program {
    public static void Main(String[] args) {
        Console.WriteLine("Enter Flight name :");
        string name=Console.ReadLine();
        Console.WriteLine("Enter Ticket No :");
         int num=Convert.ToInt32(Console.ReadLine());
         Console.WriteLine("Enter Flight Fare :");
         double fare=Convert.ToDouble(Console.ReadLine());
         Console.WriteLine("Enter Travelling Class :");
         char c=Convert.ToChar(Console.ReadLine());
         Console.WriteLine("Enter Source :");
         string sr=Console.ReadLine();
         Console.WriteLine("Enter Destination :");
         string des=Console.ReadLine();
         Console.WriteLine("Flight Details :");
         Console.WriteLine("Flight Name : "+name);
         Console.WriteLine("Ticket No : "+num);
         Console.WriteLine("Flight Fare : "+fare);
         Console.WriteLine("Class : "+c);
         Console.WriteLine("Source : "+sr);
         Console.WriteLine("Destination : "+des);
     }
}      
