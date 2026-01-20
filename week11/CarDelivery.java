package week11;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Delivery
{
    private static final double PER_KM_CHARGE=60;
    private static final double MIN_PER_KM=5;
    public CarDelivery(int orderId, double distanceInKm, String pickUp, String dropOf)
    {
        super(orderId, distanceInKm, pickUp, dropOf);
    
    }
    
    @Override
    public  double calculateCharge(){
        return super.getDistance() * PER_KM_CHARGE;
        
    }
    
        
    
    @Override
    public double estimateTime()
    {
        return super.getDistance() * MIN_PER_KM;
        
    }

  
}