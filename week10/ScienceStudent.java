package week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
{
    public ScienceStudent(int rollno, String name, double marks)
    {
        super(rollno, name, marks);
    }
    
    @Override
    public String calculateresult()
    {
        if(getmarks()<45)
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
        if((getmarks() + gracemarks)<45)
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