package week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    
    public static void main(String[] args){
        BikeDelivery b1 = new BikeDelivery(001, "harrey", 75000);
        System.out.println(b1.toString());
        System.out.println("Salary: "+b1.calculatepayment());
        
        CarDelivery c1 = new CarDelivery(210, "harrey", 54000);
        System.out.println(c1.toString());
        System.out.println("Salary: "+c1.calculatepayment());
        
    }

}
