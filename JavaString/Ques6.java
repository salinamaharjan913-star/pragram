package JavaString;
import java.util.Scanner;



/**
 * Write a description of class Ques6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ques6
{
   public static void main(String[] args)
    {
         Scanner input =new Scanner(System.in);
         String text="Hello";//reverse: "olleH"
        StringBuilder sb=new StringBuilder();
        
        for(int i=text.length()-1; i>0; i--)
        {
            sb.append(text.charAt(i));
        }
        
        System.out.println("Reversed String: "+sb.toString());
        if(text.equals(sb.toString())){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
        
        
        

