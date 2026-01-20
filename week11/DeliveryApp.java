package week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args){
        // int orderId, double distanceInKm, String pickUp, String dropOff
        //parent-child reference object --> dynamic method dispatch
        Delivery d1= new CarDelivery(101, 12, "Boudha", "lagankhel");
        System.out.println(d1.calculateCharge());
    }
}