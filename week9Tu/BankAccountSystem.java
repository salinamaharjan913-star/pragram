package week9Tu;


/**
 * Write a description of class BankAccountSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountSystem
{
    
    private int bankaccountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccountSystem(int bankaccountNumber, String accountHolderName, double balance) {
        this.bankaccountNumber = bankaccountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }
}