package Week12;
import java.util.ArrayList;


/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String[]args)
    {
        ArrayList<Student> students= new ArrayList<>();
        
        students.add(new Student(101, "Salina")); //oth index-->101,salina
        students.add(new Student(102, "Sabina"));
        students.add(new Student(103, "Sarina"));
        
        System.out.println(students.get(0));
        
        for(Student std: students)
        {
            System.out.println(std);
        }
    }
}