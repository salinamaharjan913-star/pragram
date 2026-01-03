package week9Tu;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        car1 c1=new car1(1220, "mem", 300000, 4, "Petrol"); 
       c1.displaycardetails();
       System.out.println("Tax:" +c1.calculateTax());
       System.out.println("Final price:" +c1.calculatefinalprice());
       
       bike b1= new bike (2032, "Delp", 1350000, 400);
       b1.displayVehicle1Info();
       System.out.println("Tax:"+b1.calculateTax());
       System.out.println("Final price:" +b1.calculateFinalPrice());
    }
}
