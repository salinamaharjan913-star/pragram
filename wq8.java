import java.util.Scanner;

/**
 * Write a description of class wq8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wq8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number:");
        n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}