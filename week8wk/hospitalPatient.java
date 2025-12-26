package week8wk;


/**
 * Write a description of class hospitalPatient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hospitalPatient
{
    //attributes
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    
    //constructors
    public hospitalPatient(String patientName, int age, int daysAdmitted, double dailyCharge)
    {
        this.patientName=patientName;
        this.age=age;
        this.daysAdmitted=daysAdmitted;
        this.dailyCharge=dailyCharge;
        
    }
    public void setdaysAdmitted(int daysAdmitted)
    {
      this.daysAdmitted=daysAdmitted;  
    }
    
    public int getdaysAdmitted()
    {
        return this.daysAdmitted;
    }
    
    private double totalBill;
     
    //Method to calculate total hospital bill
    public double calculateTotalBill(){
        double totalBill=daysAdmitted*dailyCharge;
         
        //10% discount if dailyAdmitted > 7
        if (daysAdmitted > 7){
             totalBill= totalBill*0.9;
        }
        return totalBill;
    }
    
    public void displayInfo(){
        System.out.println("patientName: " +patientName);
        System.out.println("age: "+age);
        System.out.println("daysAdmitted: " +daysAdmitted);
        System.out.println("dailyCharge: " +dailyCharge);
        System.out.println("totalBill: " +totalBill);
    }
    
    
}