package Scenarioweek7;




public class Main
{
    public static void main (String[]args)
    {
    
        BankAccount Customer1 = new BankAccount(0001, "shreya", 180000);
        
        Customer1.displayDetails();
        Customer1.depositamt(1000);
        Customer1.withdrawl(-200);
        Customer1.currentbalance();
         
        System.out.println();
        
        BankAccount Customer2 = new BankAccount(0011, "sara", 8000);
        
        Customer2.displayDetails();
        Customer2.depositamt(40000);
        Customer2.withdrawl(40000);
        Customer2.currentbalance();
    
    }
}
