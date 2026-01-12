package week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
    
    public CarDelivery(int partnerid, String name, int basepay){
        super(partnerid, name, basepay);
    }
    
    @Override
    public double calculatepayment()
    {
        return super.calculatepayment() +7000;
    }
    public double calculatepayment(int extraorders)
    {
        return super.calculatepayment() + (extraorders *3800);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }    
}
