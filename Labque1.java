import java.util.Scanner;

/**
 * Write a description of class Labque1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Labque1
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your grades=");
        int grade= input.nextInt();
        String isValid=(grade>=40) ? "pass":"fail";
        System.out.println(isValid);
    }
}
