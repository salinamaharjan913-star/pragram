package week9Tu;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args) {

        SavingAccount savings = new SavingAccount(1001, "Amit", 5000, 5);
        CurrentAccount current = new CurrentAccount(2001, "Riya", 3000, 2000);

        System.out.println("---- Saving Account ----");
        savings.deposit(2000);
        System.out.println("Balance: " + savings.getBalance());
        System.out.println("Interest: " + savings.calculateInterest());

        System.out.println("\n---- Current Account ----");
        current.deposit(1000);
        current.withdraw(3500);
        System.out.println("Balance: " + current.getBalance());
    }
}