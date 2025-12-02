
/**
 * Write a description of class LoopT5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopT5
{
    public static void main(String[] args)
    {
        // sum of 10 natural numbers;
        
        int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum= sum+i;
            System.out.println(sum);
        }
        System.out.println("Total sum: "+sum);
    }
}