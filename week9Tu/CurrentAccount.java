package week9Tu;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccountSystem
{
    private double overdraftLimit;

    // Constructor using super
    public CurrentAccount(int accountNumber, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Withdraw method with overdraft support
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
            return false;
        }
    }}
    
