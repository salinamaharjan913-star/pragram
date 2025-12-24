package ObjectOriented;




/**
 * Write a description of class Book2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main(String[]args){
       Book b1=new Book();
       b1.title="MunaMadan";
       b1.author="LaxmiPrasad";
       b1.price=125;
       System.out.println(b1.title);
       System.out.println(b1.author);
       System.out.println(b1.price);
       
       Book b2=new Book();
       b2.title="Law";
       b2.author="Ram";
       b2.price=152;
       System.out.println(b2.title);
       System.out.println(b2.author);
       System.out.println(b2.price);
       
       Rectangle r1=new Rectangle();
       r1.length=5;
       r1.breadth=4;
       r1.area();
       System.out.println(r1.length);
       System.out.println(r1.breadth);
       
       Rectangle r2=new Rectangle();
       r2.length=15;
       r2.breadth=4;
       r2.area();
       System.out.println(r2.length);
       System.out.println(r2.breadth);
       
       Employee e1=new Employee();
       e1.id="np001";
       e1.name="Shyam";
       e1.salary=4500;
       System.out.println(e1.id);
       System.out.println(e1.name);
       System.out.println(e1.salary);
       
       Employee e2=new Employee();
       e2.id="np005";
       e2.name="Sara";   //non parametarized constructor
       e2.salary=5000;
       
       System.out.println(e2.id);
       System.out.println(e2.name);
       System.out.println(e2.salary);
       
       Employee e3=new Employee();
       e3.id="np007";
       e3.name="Sham";
       e3.salary=4700;
       System.out.println(e3.id);
       System.out.println(e3.name);
       System.out.println(e3.salary);
       
       
       if(e1.salary>e2.salary && e1.salary>e3.salary)
       {
           System.out.println("np001 salary is highest");
        }
           else if(e2.salary>e3.salary && e2.salary>e1.salary)
           {
               System.out.println("np005 salary is highest");  
               
           }
           else
           {
           System.out.println("np005 salary is highest");
        }
        
        
    //Laptop
    
    Laptop l1=new Laptop("dell", 16, 50000);
    Laptop l2=new Laptop("Hp", 4, 70000);    //parametarized constructor
    Laptop l3=new Laptop("lenovo", 24, 80000);
    
    
    //mobile
        Mobile m1 = new Mobile("Redmi", 10000);
        Mobile m2 = new Mobile("Samgsung", 50000);
        Mobile m3= new Mobile("xiomi", 12000);
        
        m1.isaffordable();
        m2.isaffordable();
        m3.isaffordable();
        
        //result
        
        result o1 = new result(30,85,60);
        result o2 = new result(85,70,57);
        
        o1.total();
        o2.total();
        
       }
    }
       
    
    
       
       
       
       
        
        
