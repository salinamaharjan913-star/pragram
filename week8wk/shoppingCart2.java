package week8wk;


/**
 * Write a description of class shoppingCart2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingCart2
{
    public static void main(String[] args)
    {
    shoppingCart1 s1 = new shoppingCart1("Tablet", 50000, 2);
    s1.displaycart();
    System.out.println("Discounted Price: "+s1.calculateDiscountedTotal(10));
    }
}