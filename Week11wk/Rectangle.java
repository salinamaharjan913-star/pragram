package Week11wk;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath= breath;
    }
    
    @Override
    public double calculateArea(){
        return length*breath;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2*(length+breath);
    }
    
    @Override
    public void draw()
    {
    System.out.println("Drawing rectangle");
    
    }
    
}