package week9Tu;


/**
 * Write a description of class contractemployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class contractemployee extends employee
{
    private int workingdays;
    public contractemployee(int employeeID,String name,int basicsalary, int workingdays )
    {
        super(employeeID,name,basicsalary);
        this.workingdays= workingdays;
    }
    double calculatetotalsalary(){
        double total = basicsalary * workingdays;
        return total;
    }

}