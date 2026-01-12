package week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student
{
    public ManagementStudent(int rollno, String name, double marks)
    {
        super(rollno, name, marks);
    }
    
     @Override
    public String calculateresult()
    {
        if(getmarks()<40)
        {
            return "Fail";
        }
        else
        {
            return "Pass";
        }
    }
    
    public String calculateresult(int gracemarks)
    {
        if((getmarks() + gracemarks)<40)
        {
            return "Fail";
        }
        else
        {
            return "Pass";
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}