
/**
 * Write a description of class loop10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop10
{
    public static void main(String[] args){
        int rows= 5;
        int columns= 5;
        
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=columns; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}