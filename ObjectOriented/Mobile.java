package ObjectOriented;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    int price;
    
    public Mobile(String brand, int price)
    {
        this.brand=brand;
        this.price=price;
    }
         void isaffordable()
         {
         if(this.price < 20000){
        System.out.println(this.brand);
        System.out.println(this.price);
        }
        else{
        System.out.println(brand+"It is not affordable");
        System.out.println();
        }
    }
    }

        
    