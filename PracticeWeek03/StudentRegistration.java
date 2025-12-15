package PracticeWeek03;
import java.util.Scanner;


/**
 * Write a description of class StudentRegistration here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRegistration // pascalcase
{
    String name= "Sandesh"; // instance variable
    static int age= 20; // static variable
    
    public static void main(String[] args)
    {
        int totalSalesInPrice=20; // local variable 
        String name= "Hello World";
        
        System.out.println(name);
        
        
        // Arithmetic Operator
        
        int a= 10;
        int b= 20;
        
        int sum= a+b;
        int difference= b-a;
        int multiply= a *b;
        int division= b/a;
        
        int remainder= b % a; // 0
        
        //Assignment
        
        sum += 10;  // sum= 30 --> sum= sum +10;
        
        difference= 5; // just for updating
        
        difference -= 5; // difference =10 , difference= difference -5;
        
        
        
        // post, pre increment
        
        
        int c=10;  // c=1  
        //int d= ++c; // d= 2, c=2
        //int e= c++; // e = 2, c=3
        
        //System.out.println(c + d + e); // 7
        
        
        
        // post, pre decrement
        
        System.out.println(--c); // c=9, --c =9
        System.out.println(c); // c=9
        System.out.println(c--); // c=8, c-- = 9
        
        
        // Relational Operators
        
        int d= 10;
        int e= 10;
        
        System.out.println(d == e); // false
        System.out.println(d != e); // true
        System.out.println(d < e); // true
        System.out.println(d > e); // false
        System.out.println( d <= e); // true
        System.out.println(d >= e); // true
        
        
        
        // Scanner class --> user input 
        
        Scanner obj= new Scanner(System.in);
        
        // integer, String, double, character
        
        System.out.println("Ask for first number: ");
        
        int firstNum=obj.nextInt(); 
        
        System.out.println("My first number is :"+ firstNum);
        
        System.out.println("Ask for second number: ");
        
        double secondNum= obj.nextDouble();
        
        System.out.println("My second number is: "+ secondNum);
        
        int age= 20;
        
        String isValid= (age >= 18)? "Eligible for citizenship"  : "Is not Eligible " ;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
}