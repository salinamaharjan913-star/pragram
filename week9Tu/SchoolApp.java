package week9Tu;


/**
 * Write a description of class SchoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolApp
{
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Sunita", 35000, "Science", 25000);
        Staff staff = new Staff(2, "Manil", 180, 250);

        System.out.println("Teacher Annual Salary: " + teacher.calculateAnnualSalary());
        System.out.println("Staff Salary: " + staff.calculateSalary());

        // Print static variable
        System.out.println("College Name: " + Person.collegeName);
    }
}