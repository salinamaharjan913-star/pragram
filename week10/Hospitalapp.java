package week10;


/**
 * Write a description of class Hospitalapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hospitalapp
{
    public class HospitalApp
{
   public static void main (String[] args)
   {
       Doctor d1 = new Doctor(11, "Rammaya", "Dietcian", 55000);
       System.out.println(d1.toString());
       System.out.println("Salary: "+d1.calculatesalary());
        
       Nurse n1 = new Nurse(01, "Harilal", "ala", 20500);
        
       System.out.println(n1.toString());
       System.out.println("Salary: "+n1.calculatesalary());
   }
}
}