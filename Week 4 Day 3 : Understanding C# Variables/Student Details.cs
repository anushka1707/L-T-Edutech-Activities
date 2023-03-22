using System;

class Program{
    public static void Main(String []args){
        Console.WriteLine("Enter name :");
        string name=Console.ReadLine();
        Console.WriteLine("Enter Roll No :");
        int roll=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter Subject :");
        string sub=Console.ReadLine();
        Console.WriteLine("Enter Marks :");
        float marks=Convert.ToSingle(Console.ReadLine());
        Console.WriteLine("Enter Grade :");
        char grade=Convert.ToChar(Console.ReadLine());
        Console.WriteLine(name+" Details :");
        Console.WriteLine("Roll No : "+roll);
        Console.WriteLine("Subject : "+sub);
        Console.WriteLine("Marks : "+marks);
        Console.WriteLine("Grades : "+grade);
         }
}
