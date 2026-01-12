package week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(int id, String name, String shift, double extraAllowance){
        super(id,name);
        this.shift=shift;
        this.extraAllowance=extraAllowance;
    }
    @Override
    
       
    public double calculatesalary()
    {
        return super.calculatesalary()+ extraAllowance;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ "Nurse--> Shift:"+shift+", Extra allowance:" +extraAllowance;
    }    
}
    
        

