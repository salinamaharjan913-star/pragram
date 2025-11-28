import java.util.Scanner;

/**
 * Write a description of class ques9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques9
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gpa");
        float g=input.nextFloat();
        System.out.println("Enter your attendance");
        int a= input.nextInt();
        System.out.println("Enter your attitude score");
        int att= input.nextInt();
        if (g>=3.2 && g<=4.0){
            if(a>80){
                if(att<5){
                    System.out.println("The student is eligible for scholarship");
                }
                else{
                    System.out.println("The student is not eligible for scholarship");
                }
        
            }
            else{
                System.out.println("The student is not eligible for scholarship");
            }
        }
        else{
            System.out.println("The student is not eligible for scholarship");
        }
        
}
}