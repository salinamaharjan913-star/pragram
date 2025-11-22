import java.util.Scanner;

/**
 * Write a description of class Rickshawfare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rickshawfare
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter distance in km");
        Double distance = scan.nextDouble();
        
        System.out.print("Enter time in minutes");
        Double time = scan.nextDouble();
        
        System.out.print("Is it night trvael? (yes/no)");
        String isNight = scan.next();
        System.out.print("Is the customer a local? (yes/no)");
        String islocal= scan.next(); 
        
        Double baseFare = 30.0; //fixed cost
        Double perKmRate = 25.0; //cost per km
        Double perMinRate = 55.0; //cost per min
        Double nightcharge = 60.0; // extra for night
        
     
        Double fare = baseFare + (distance * perKmRate) + (time * perMinRate);
        //Local discount (10%)
        if
        (islocal.equals("yes") && distance > 10);
        fare = (fare * 0.99);
        
        //Night charge
        fare = (isNight.equals("yes")) ?
        (fare + nightcharge) : fare ;
        
        System.out.println("Total Fare: Rs." + fare);
        
        
    }
        
        
        
        
}