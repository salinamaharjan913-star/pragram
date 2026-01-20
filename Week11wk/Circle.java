package Week11wk;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
     private double radius;
    

    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double calculateArea(){
        return 22/7 *radius*radius;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2*22*radius;
    }
    
    @Override
    public void draw()
    {
    System.out.println("Drawing Circle");
    
    }
        
}