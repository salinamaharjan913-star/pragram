package week8wk;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    //attributes
    private int accountNumber;
    private double balance;
    private String name;
    
    //constructor
    public BankAccount(int accountNumber, double balance, String name)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        
        
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    
    }
    public double balance()
    {
        return this.balance=balance;
    }
    
    void deposit(double amount){
        balance= balance + amount;
        System.out.println("You have successfully deposited Rs:" + amount + "in account "+ accountNumber);
    }
    
    public boolean withdrawl(double amount){
        if (balance>=amount){
            System.out.println("Withdraw successful");
            balance = balance-amount;
            return true;
        }
        return false;
    }
}