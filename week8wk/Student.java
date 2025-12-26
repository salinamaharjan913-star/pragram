package week8wk;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //attributes
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    private static String collegeName = "Islington";
    //constructors
    public Student(String name, int id, String address, long phoneNumber)
    {
        this.name=name;
        this.id=id;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    
    //setters and getters methods
    
    public void setName(String name)
    {
      this.name=name;  
    }
    
    public String getName()
    {
        return this.name;
    }
    
    // getters and setters for id as well
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    //getters and setters for address
    public void setaddress(String address)
    {
    this.address=address;
}

public String getaddress()
{
   return this.address; 
}

//getters and setters for phoneNumber
public void setphoneNumber(long phoneNumber)
{
    this.phoneNumber=phoneNumber;
}

public long getphoneNumber()
{
    return this.phoneNumber;
}


    public void displayInfo()
    {
        System.out.println("Name of the student is: "+this.name);
        System.out.println("Id of the student is: "+this.id);
        System.out.println("address of the student is: "+this.address);
        System.out.println("phoneNumber of the student is: "+this.phoneNumber);
    }
}