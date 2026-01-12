package week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String[] args){
        ScienceStudent S1=new ScienceStudent(22,"Salina",55);
        System.out.println(S1.toString());
        System.out.println("Result:"+S1.calculateresult());
        
        ManagementStudent M1=new ManagementStudent(23,"Sabina",45);
        System.out.println(M1.toString());
        System.out.println("Result:"+S1.calculateresult());
        
        
    }
}