import java.util.Scanner;

/**
 * Write a description of class ques5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques5
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number=");
        int num= input.nextInt();
        if(num % 3 == 0)
        {
            if (num % 5 == 0)
            {
                System.out.println("Divisible by both");
            }
            else{
                System.out.println("Divisible by 3 but not by 5");
            }
            }
            else if(num% 5 == 0){
                if (num% 3 == 0)
                {
                    System.out.println("Divisible by 3 and 5 both");
                }
                else
                {
                    System.out.println("Divisible by 5 but not 3");
                }
                }
            
        
        
    
        
}
}