package week9Tu;


/**
 * Write a description of class permanentemployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class permanentemployee extends employee
{
      private int hra;
    private int da;
    
    public permanentemployee(int employeeID,String name,int basicsalary, int hra, int da )
    {
        super(employeeID,name,basicsalary);
        this.hra=hra;
        this.da=da;
    }
    double calculatetotalsalary()
    {
        double total= basicsalary + hra + da + calculatebonus();
        return total;
    }
}
    
