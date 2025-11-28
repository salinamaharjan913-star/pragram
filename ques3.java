import java.util.Scanner;

/**
 * Write a description of class ques3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques3
{
     public static void main(String[] args){
         
      Scanner input= new Scanner(System.in);
        System.out.println("Enter your number=");
        int num= input.nextInt();  
       if  (num>0) {
           System.out.println("number is positive");
        }
        else if (num<0) {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is zero");
            
        }
       }
        
}