package week10;


/**
 * Write a description of class HospitalStaffSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int id;
    private String name;
    
    public Person(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    
    //getters and setters
    public void setid(int newid){
        this.id=newid;
    }
    
    public int getid (){
        return this.id;
    }
    
    public void setname(String name){
        this.name=name;
    }
    
    public String getname(){
        return this.name;
    }
    public double calculatesalary(){
        double baseSalary=45000;
        return baseSalary;
    }
    
    @Override
    public String toString()
    {
        return "Person--> person id: "+ getid() +", person name: "+getname();
    }
    
}