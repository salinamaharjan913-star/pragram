package week9Tu;


/**
 * Write a description of class car1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car1 extends Vehicle1
{
   
   
    private int numberOfDoors;
    private String fuelType;

    // Constructor using super
    public car1(int vehicleId, String brand, double base,
               int numberOfDoors, String fuelType) {
        super(vehicleId, brand, base);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
         
    }
    
   public void displaycardetails()
   {
       System.out.println("Car ID:" +super.Vehicle1Id);
       System.out.println("Car brand name:" +super.brand);
       System.out.println("Car base price:" +super.base);
       System.out.println("No of doors:" +this.numberOfDoors);
       System.out.println("Car fuel type:" +this.fuelType);
   }
   public void setnumberofdoor(){
        this.numberOfDoors = numberOfDoors;
    }
    
    public int getnumberOfdoor(){
        return this.numberOfDoors;
   }
   public void setfueltype(){
        this.fuelType = fuelType;
    }
    
   public String getfueltype(){
        return this.fuelType;
   }
   
   double calculatefinalprice()
   {
       double tax= calculateTax();
       double luxurycharge=0.05 * base;
       return base + tax + luxurycharge;
   }
}
