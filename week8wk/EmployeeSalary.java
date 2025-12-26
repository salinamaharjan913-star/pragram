package week8wk;


/**
 * Write a description of class EmployeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary
{
    public static void main(String[] args)
    {
    Employee e1=new Employee(45000.25);  
    System.out.println(e1.grossSalary());
    e1.displayInfo();
    }
    
}