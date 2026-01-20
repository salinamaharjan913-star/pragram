package week11;


/**
 * Write a description of class Delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Delivery implements Notifications
{
    private int orderId;
    private double distanceInKm;
    private String pickUpLocation;
    private String dropOfLocation;
    
    public Delivery(int orderId, double distanceInKm, String pickUp, String dropOf)
    {
        
    this.orderId=orderId;
     this.distanceInKm=distanceInKm;
     this.pickUpLocation=pickUpLocation;
    this.dropOfLocation=dropOfLocation;
    }
    
    public int getOrderId()
    {
        return this.orderId;
    }
    
    public double getDistance()
    {
        return this.distanceInKm;
    }
    public String getpickUpLocation()
    {
        return this.pickUpLocation;
    }
    public String getdropOfLocation()
    {
        return this.dropOfLocation;
    }
    
    //charge+time
    //abstract methods
    abstract double calculateCharge();
    abstract double estimateTime();
    @Override
    public void notify(String message){
        System.out.println(message);
        
    }
    
    public void display()
    {
        System.out.println("Charge: " + this.calculateCharge());
    }
}