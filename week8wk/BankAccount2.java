package week8wk;


/**
 * Write a description of class BankAccount2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount2
{
    public static void main(String[] args){
        BankAccount eb1= new BankAccount( 500, 452200, "Sabina");
        eb1.deposit(15000);
        boolean success= eb1.withdrawl(2000);
        if (success)
        {
            System.out.println("withdrawl successful");
        }
        else {
            System.out.println("withdrawl failed");
        }
        
    }
}