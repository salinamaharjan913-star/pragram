package Scenarioweek7;




public class Main
{
    public static void main (String[]args)
    {
    
        BankAccount Customer1 = new BankAccount(0011, "shreya", 200000);
        
        Customer1.displayDetails();
        Customer1.depositamt(11000);
        Customer1.withdrawl(-500);
        Customer1.currentbalance();
         
        System.out.println();
        
        BankAccount Customer2 = new BankAccount(0012, "sara", 5000);
        
        Customer2.displayDetails();
        Customer2.depositamt(50000);
        Customer2.withdrawl(40000);
        Customer2.currentbalance();
    
    }
}
