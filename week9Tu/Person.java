package week9Tu;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected int id;
    protected String name;
    protected double basicSalary;
    static String collegeName = "ABC College";

    // Constructor
    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Calculate annual salary
    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}