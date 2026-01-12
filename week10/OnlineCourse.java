package week10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineCourse extends Course

{
    private double platformFee;
    
    public OnlineCourse(int courseId, String courseName, double baseFee, double platformFee){
        super( courseId,courseName,baseFee);
        this.platformFee=platformFee;
        
    }
    
    @Override//parent-child relation
    public double calculateFee(){
        return super.getBaseFee()+platformFee; //notation
    }
    
    public void displayOnlineCourse(){
        super.displayCourse();
        System.out.println("Fee for online course: "+ this.calculateFee());
    }
}