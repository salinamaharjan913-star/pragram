package week10;


    public class currentaccount extends account
{
    public currentaccount(int accountno, String holdername, double balance)
    {
        super(accountno, holdername, balance);
    }
    
    @Override
    public double calculateinterest(){
        return 5.0;
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
