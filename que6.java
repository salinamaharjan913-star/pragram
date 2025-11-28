import java.util.Scanner;

/**
 * Write a description of class que6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que6
{
     public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your markprice: ");
    float mp= input.nextFloat();
    
        System.out.println("Enter your category");
        char cat= input.next().charAt(0);
        if (cat=='A'){
            double sp=mp-(mp * 0.6);
            System.out.println("The selling price is:" +sp);
        }
        if (cat=='B'){
            double sp=mp-(mp * 0.4);
            System.out.println("The selling price is:" +sp);
        }
            if (cat=='C'){
            double sp=mp-(mp * 0.1);
            System.out.println("The selling price is:" +sp);
        }
        if (cat=='D'){
            double sp=mp-(mp * 0.1);
            System.out.println("The selling price is:" +sp);
        }
        
        else {
            System.out.println("Selling price:" +mp);
        }
        }
        }
        
         
         
