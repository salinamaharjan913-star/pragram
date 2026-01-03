package week9Tu;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person {
    private int workingHours;
    private double ratePerHour;

    // Constructor using super
    public Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0); // basicSalary not used for staff
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    // Calculate staff salary
    public double calculateSalary() {
        return workingHours * ratePerHour;
    }

}