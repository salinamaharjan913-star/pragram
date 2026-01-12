package week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollno;
    private String name;
    private double marks;
    
    public Student(int rollno, String name, double marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    
    public void set(int rollno){
        this.rollno=rollno;
    }
    
    public int getrollno(){
        return this.rollno;
        
    }
    
    public void set(String name){
        this.name=name;
    }
    
    public String getname(){
        return this.name;
    }
    
    public void set(double marks){
        this.marks=marks;
    }
    
    public double getmarks(){
        return this.marks;
    }
    public String calculateresult(){
        if (marks<35)
        {
            return"Fail";
        }
        else
        {
            return"Pass";
        }
    }
    @Override
    public String toString(){
        return "Student details-->student roll no:"+getrollno()+", student name:"+getname()+",student marks:"+getmarks();
        
    }
    
}