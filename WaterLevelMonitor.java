import java.util.Scanner;

/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{ 
    public static void main(String[] args)
    {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the water level in liters");
    int level= input.nextInt();
    String isValid=(level>=1000) ? "WARNING: Water level has reached 1000l or more!" : "Status: Normal";
    System.out.println(isValid);
    }
}