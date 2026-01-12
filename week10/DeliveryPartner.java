package week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private  int partnerId;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int partnerId, String name, double basePay){
        this.partnerId=partnerId;
        this.name=name;
        this.basePay=basePay;
        
    }
    //getters and setters
    public int getpartnerId(){
        return this.partnerId;
        
    }
    public void setId(int partnerId){
        this.partnerId=partnerId;
    }
     
    public void setname(String name){
        this.name=name;
    }
    
    public String getname(){
        return this.name;
    }
    
    public void setbasePay(double basePay){
        this.basePay=basePay;
    }
    
    public double getbasePay(){
        return this.basePay;
    }
    
    public double calculatepayment(){
        double calculatepayment=55000;
        return calculatepayment;
    }
    
    @Override
    public String toString()
    {
        return "partner details--> PartnerId:"+getpartnerId() +", name: "+getname() +"basePay:"+getbasePay();
}
}