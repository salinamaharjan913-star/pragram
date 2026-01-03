package week9Tu;


/**
 * Write a description of class Vehicle1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle1
{
    protected int Vehicle1Id;
    protected String brand;
    protected double base;
    
    
    public Vehicle1(int VehicleId, String brand, double base){
        this.Vehicle1Id=Vehicle1Id;
        this.brand=brand;
        this.base=base;
    }
    
  void displayVehicle1Info() {
        System.out.println("Vehicle1 ID: " + Vehicle1Id);
        System.out.println("brand: " + brand);
        System.out.println("base: " + base);
    }

    // Method to calculate tax (10% of base price)
    public double calculateTax() {
        return base * 0.10;
    }
}

