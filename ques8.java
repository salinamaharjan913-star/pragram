import java.util.Scanner;

/**
 * Write a description of class ques8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques8
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gpa");
        float g= input.nextFloat();
        if(g>=0.0 && g<=4.0){
            System.out.println("The gpa is valid");
            if(g>=0.0 && g<2.0){
             System.out.println("Fail");
            }
            else if(g>=2.0 && g<2.4){
             System.out.println("Your grade is C");
            }
            else if(g>=2.4 && g<=2.8){
             System.out.println("Your grade is B");
            }
            else if(g>=2.0 && g<=3.2){
            System.out.println("Your grade is B+");
        }
        else if(g>=3.2 && g<=3.6){
            System.out.println("Your grade is A");
        }
        else if(g>=3.6 && g<=4.0){
            System.out.println("Your grade is A+");
        }
    }
}
}
        
        
            
            
            
            
        
