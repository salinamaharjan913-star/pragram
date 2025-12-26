package week8wk;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    //attributes
    private String customerName;
    private int unitsConsumed;
    double bill;
    double total;
    ElectricityBill(String customerName, int unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }
 public double calculateBill(){
        if(unitsConsumed < 100){
        bill = unitsConsumed * 5;
        }
        else if(unitsConsumed > 100){
        bill = unitsConsumed * 5 + ((unitsConsumed - 100) * 8);
        }
        return bill;
    }
    public void display(){
        System.out.println("Name: "+this.customerName);
        System.out.println("Units Consumed: "+this.unitsConsumed);
        System.out.println("Unit Bill: "+bill);
    }
}