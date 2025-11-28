import java.util.Scanner;

/**
 * Write a description of class ques7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques7
{
     public static void main(String[] args){
         Scanner input= new Scanner(System.in);
         System.out.println("Enter your markprice");
         float mp= input.nextFloat();
         System.out.println("Enter your category");
         char cat= input.next().charAt(0);
         double sp;
         
         switch (cat){
             case 'A':
                 sp=mp-(mp * 0.6);
                 System.out.println("The selling price is:" +sp);
                 break;
                 
             case 'B':
                 sp=mp-(mp * 0.4);
                 System.out.println("The selling price is:" +sp);
                 break;
             case 'C':
                 sp=mp-(mp * 0.2);
                 System.out.println("The selling price is:" +sp);
                 break;
             case 'D':
                 sp=mp-(mp * 0.1);
                 System.out.println("Selling price:" +mp);
                }
        
         }
}