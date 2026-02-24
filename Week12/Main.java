package Week12;
import java.util.ArrayList;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
    ArrayList<Student2> student= new ArrayList();
        
        student.add(new Student2("Ayush", 9876543210L, "L1N1"));
        student.add(new Student2("Rahul", 9876543211L, "L1M1"));
        student.add(new Student2("Gaurav", 9876543212L, "L1N2")); 
        
        //remove
        student.remove("Gaurav");
        System.out.println("After removal: " +student);
        //insert 
        student.add(0,new Student2("Aavaya", 9876543213L,"L1C1"));
        System.out.println("After intersection: "+student);
        
        for (Student2 std:student){
            if(std.getnames().equals("Ayush" )){
                std.setnames("Aayush");
            }
        }
        
}
}