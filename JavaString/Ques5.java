package JavaString;
import java.util.Scanner;


/**
 * Write a description of class Ques5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ques5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        System.out.println("Enter another string");
        String str2 = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        System.out.println(sb.append(str1).append(" ").append(str2).append(" #1"));
        
    }
}