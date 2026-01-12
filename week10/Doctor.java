package week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specilization;
    private double consultationfee;
    
    public Doctor(int id, String name, String specilization, double consultationfee){
        super(id, name);
        this.specilization=specilization;
        this.consultationfee=consultationfee;
        
        
    }
    @Override
    public double calculatesalary(){
        return super.calculatesalary()+consultationfee;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ "Doctor--> specilizayion:"+specilization+", consultantionfee:" +consultationfee;
    }    
}