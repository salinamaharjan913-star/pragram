import java.util.Scanner;

/**
 * Write a description of class que4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que4
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number=");
        int num= input.nextInt();
        if (num% 5 ==0 && num% 3==0)
        {
            System.out.println("Divisible by 3 and 5 both");
        }
        else {
            System.out.println("Divisivle by 5 but not 3");
            
        }
        }
    }
