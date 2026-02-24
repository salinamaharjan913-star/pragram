package Week12;


/**
 * Write a description of class Student2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student2
{
    
        //attributs
        private String names;
        private long phone;
        private String group;
        
        public Student2(String names, long phone, String group){
            this.names=names;
            this.phone=phone;
            this.group=group;
        }
        
        public void setnames(String name)
    {
        this.names=names;
    }
    
    public String getnames()
    {
        return this.names;
    }
    
    public void setphone(long phone)
    {
        this.phone=phone;
    }
    
    public long getphone()
    {
        return this.phone;
    }
    
    public void setgroup(String group)
    {
        this.group=group;
    }
    
    public String getgroup()
    {
        return this.group;
    }
    
    public String toString()
    {
        return "name"+names+"phone"+phone+"group"+group;
    }   
        
    
}