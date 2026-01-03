package week9Tu;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected String brandName;
    protected int maxSpeed;
    
    //public Vehicle() //nonparametarized
    //{
       // System.out.println("Vehicle default constructor");
    //}
    
    public Vehicle(String brandName, int maxSpeed)//parametarized
    {
        this.brandName=brandName;
        this.maxSpeed=maxSpeed;
    }
}