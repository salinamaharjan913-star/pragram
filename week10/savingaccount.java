package week10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class savingaccount extends account
{
    public savingaccount(int accountno, String holdername, double balance)
    {
        super(accountno, holdername, balance);
    }
    
    @Override
    public double calculateinterest(){
        return  2.0;
    }
    
    public double calculateinterest(double rate){
        return ((this.getbalance()*this.calculateinterest()*rate)/100);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }    
}
