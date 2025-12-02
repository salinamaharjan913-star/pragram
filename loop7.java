
/**
 * Write a description of class loop7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop7
{
    public static void main(String[] args){
        for(int i=1; i<=5; i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}