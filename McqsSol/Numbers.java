package McqsSol;


/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    public static void main(String[] args)
    {
        int i=0;
        for(i=0; i<10; i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}