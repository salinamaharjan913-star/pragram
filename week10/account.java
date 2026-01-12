package week10;


/**
 * Write a description of class Accountclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class account
{
     private int accountno;
    private String holdername;
    private double balance;
    
     public account(int accountno, String holdername, double balance){
        this.accountno= accountno;
        this.holdername = holdername;
        this.balance= balance;
    }
    
    public void setaccountno(int accountno){
        this.accountno= accountno;
    }
    
    public int getaccountno(){
        return this.accountno;
    }
    
    public void setholdername(String holdername){
        this.holdername = holdername;
    }
    
    public String getholdername(){
        return this.holdername;
    }
    
    public void setbalance(double balance){
        this.balance = balance;
    }
    
    public double getbalance(){
        return this.balance;
    }
    
    public double calculateinterest(){
        return 0.0;
    }

    @Override
    public String toString()
    {
        return "Account details--> Holder's account no:"+getaccountno() + ", Holder's name: "+ getholdername() + ", Balance:" + getbalance();
    }
}