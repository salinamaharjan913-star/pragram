package Week11wk;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape implements Drawable
{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public void displayShapeInfo(){
        System.out.println("Area: " + this.calculateArea());
        System.out.println("Perimeter: " + this.calculatePerimeter());
    
    }
}