package ObjectOriented;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
    String brand;
    int RAM;
    int price;
    
    public Laptop(String brand, int RAM,int price)
    {
        this.brand= brand;
        this.RAM= RAM;
        this.price= price;
    } 
        void checkRAM(){
            if (RAM>8)
            {
                System.out.println("RAM is greater than 8");
                
            }
            else{
                System.out.println("RAM is not greater than 8");
            }
        }
}
