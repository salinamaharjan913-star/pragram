import java.util.Scanner;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test

{
    public static void main(String[] args) 
    {

        Scanner input =new Scanner (System.in);
        System.out.println("Enter first number");
        int firstnum= input.nextInt();
        System.out.println( "My first number is:"+ firstnum);
        System.out.println( "Enter second number");
        int secnum= input.nextInt() ;
        System.out.println( "My second number is:" +secnum)
        int sum= firstnum+secnum;
        System.out.println( "The sum is:" +sum);
        
    }
}   
            
        
        
        
        
    
    
        
        
        
        
        
