package week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    
        
    public BikeDelivery(int partnerid, String name, int basepay){
        super(partnerid, name, basepay);
    }
    
    @Override
    public double calculatepayment()
    {
        return super.calculatepayment() +3000;
    }
    public double calculatepayment(int extraorders)
    {
        return super.calculatepayment() + (extraorders *300);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }    
}
