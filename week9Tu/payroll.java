package week9Tu;


/**
 * Write a description of class payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class payroll
{
    public static void main (String[] args)
    {
        permanentemployee e1= new permanentemployee(163, "Salina", 17000, 5000, 3600);
        contractemployee ce1 = new contractemployee (112, "Jashmin", 2450, 600);
        
        e1.displayemployee();
        System.out.println("Final Salary: "+e1.calculatetotalsalary());
        
        ce1.displayemployee();
        System.out.println("Final Salary: "+ce1.calculatetotalsalary());
    }
}
