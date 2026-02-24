package JavaString;
import java.util.Scanner;


/**
 * Write a description of class Ques1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ques1
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first string");
        String first =input.next();
        
        System.out.println("Enter second string");
        String second =input.next();
        
        String Concat = first.concat(second);
        System.out.println("Concatenated String: "+Concat);
        
        System.out.println("Enter third string");
        String third =input.next();
        
        System.out.println("Strings ="+Concat.equals(third));
        
        
        
    }
}