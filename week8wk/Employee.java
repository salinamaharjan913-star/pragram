package week8wk;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    //attributes
    private double basicSalary;
    //constructor
    public Employee(double salary){
        this.basicSalary = salary;
    }
    
    public void setSalary(double salary)
    {
        this.basicSalary= salary;
    
    }
    
    //GrossSalary
    public double grossSalary()
    {
        return this.basicSalary+ 0.20 * this.basicSalary;
    }
    
    public void displayInfo()
    {
        System.out.println(grossSalary());
    }
    
    
}