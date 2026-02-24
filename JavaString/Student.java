package JavaString;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int age;            //attributes
    private String school;
    private int grade;
    private String citizenship;
    private String phone;   
    
    //constructor
    public Student(String name, int age, String school, int grade, String citizenship, String phone) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.grade = grade;
        this.citizenship = citizenship;
        this.phone = phone;
    }
    
    // Getter methods
    public String getName()
    { 
        return this.name; 
    }
    public int getAge() 
    {
        return this.age; 
    }
    public String getSchool() 
    {
        return this.school; 
    }
    public int getGrade() 
    { 
        return this.grade; 
    }
    public String getCitizenship() 
    { 
        return this.citizenship; 
    }
    public String getPhone() {
        
        return this.phone; 
        
    }
    
    public String getNameInitials(){
        String[] parts = name.split(" ");
        String initials = "";
        for(String x : parts){
            initials = initials + x.charAt(0) + ".";
        }
        return initials;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s,Age: %d, School: %s,Grade: %d",this.name,this.age,this.school,this.grade);
    }
    
    

}