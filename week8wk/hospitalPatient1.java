package week8wk;


/**
 * Write a description of class hospitalPatient1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hospitalPatient1
{
    public static void main(String[] args){
        hospitalPatient a1=new hospitalPatient("Aarati", 45, 7, 200000.5);
        hospitalPatient a2=new hospitalPatient("Kriti", 36, 15, 205025.7);
        
        System.out.println("hospitalPatient a1 Details");
        a1.displayInfo();
        System.out.println("Total Bill: $" +a1.calculateTotalBill());
      
        
        System.out.println("hospitalPatient a2 Details");
        a2.displayInfo();
        System.out.println("Total Bill: $" +a2.calculateTotalBill());
    
    }
}