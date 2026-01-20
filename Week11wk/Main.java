package Week11wk;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Shape[] shape1= new Shape[2];
        shape1[0] = new Rectangle(5, 2);
        shape1[1] =new Circle(2);
        
        for(int i=0; i<2; i++){
        shape1[i].displayShapeInfo();
    }
}
}