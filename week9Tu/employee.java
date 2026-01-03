package week9Tu;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employee
{
    
    protected int employeeID;
    protected String name;
    protected int basicsalary;
    public employee(int employeeID, String name, int basicsalary)
    {
        this.employeeID=employeeID;
        this.name=name;
        this.basicsalary=basicsalary;
    }
    double calculatebonus()
    {
        double bonus= 0.1* basicsalary;
        return bonus;
    }
    void displayemployee()
    {
        System.out.println("Employee ID:" +this.employeeID);
        System.out.println("Employee name:" +this.name);
        System.out.println("Basic salary:" +this.basicsalary);
    }
}