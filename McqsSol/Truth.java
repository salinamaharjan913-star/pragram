package McqsSol;


/**
 * Write a description of class Truth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Truth
{
    public static void main(String[] args)
    {
        int x=1, y=2;
        if (x< ++y && y++ < 10)
        {
            y=y+5;
        }
        else 
        {
            y=y+10;
        }
        System.out.println(y);
    }
    //output =9
}