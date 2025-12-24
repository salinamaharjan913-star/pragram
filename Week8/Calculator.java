package Week8;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    //instance method
    //void returm type + no parameters
    public void displayInfo()
    {
      System.out.println("Welcome to Calculator app");  
    }
    // void return type + parameters
    public void add(int a, int b) //formal parameters
    {
        System.out.println("The sum of two numbers are: "+(a+b));
    }
    
    // return type + no parameters
    
    public int getFixedNumber()
    {
        return 10;
    }
    
    // return type + parameters
    public int multiply(int c, int d)
    {
        int mul=c*d;
        return mul;
    }
    
    
    //static method
    
    public static int square(int a)
    {
        return a*a;
    }

}