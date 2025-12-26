package week8wk;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main(String[]args){
        Student st1= new Student("Salina",100,"Kathmandu",000123);
        st1.displayInfo();
        st1.setName("alpha");
        st1.setId(101);
        st1.setaddress("Bhaktapur");
        st1.setphoneNumber(125643);
       
        st1.displayInfo();
    }
}