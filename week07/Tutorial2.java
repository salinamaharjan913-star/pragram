package week07;


/**
 * Write a description of class tutorial2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial2
{
    public static void main(String[]args){
        Student s1= new Student();
        s1.collegeId= "np014sp10";
        s1.name="Salina";
        s1.age=18;
        s1.study();
        System.out.println(s1.collegeId);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2= new Student();
        s2.collegeId= "np40012";
        s2.name= "Riya";
        s2.age= 23;
        s2.laugh();
        System.out.println(s2.collegeId);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
}
}
