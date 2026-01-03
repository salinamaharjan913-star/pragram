package week9Tu;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bike extends Vehicle1
{
    
    private int engineCapacity;

    // Constructor using super
    public bike(int vehicleId, String brand, double base, int engineCapacity) {
        super(vehicleId, brand, base);
        this.engineCapacity = engineCapacity;
    }

    // Method to calculate final price
     double calculateFinalPrice() {
        return base + calculateTax();
    }

}