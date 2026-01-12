package week10;


/**
 * Write a description of class OflineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OflineCourse extends Course
{
    private double labFee;
    
    public OflineCourse(int courseId, String courseName, double baseFee, double labFee){
        super( courseId,courseName,baseFee);
        this.labFee=labFee;
        
    }
    
    @Override//parent-child relation
    public double calculateFee(){
        return super.getBaseFee()+labFee; //notation
    }
    
    public void displayOflineCourse()
    {
       super.displayCourse();
       System.out.println("Fee for ofline course:"+this.calculateFee());
    }
}