import java.util.Scanner;

/**
 * Write a description of class arrayq4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayq4
{
    public static void main(String[]args){
        int[] arr={10,20,30,40,50};
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
         
        int sum =0;
        for(int i=0; i< arr.length; i++)
        {
            sum= sum+ arr[i];
        }
        System.out.println(sum);
        int[] agr={10,20,30,40,50};
        double avg= sum/5;
        int high= agr[0];
        int low= agr[0];
        for (int j=1; j<agr.length; j++){
            if (agr[j]>high){
                high= agr[j];
            }
            if(arr[j]<low){
                low= agr[j];
            }
        }
        System.out.println("highest="+high);
        System.out.println("lowest="+low);
        
        Scanner input= new Scanner(System.in);
        System.out.println("Pass me the length of index");
        int len= input.nextInt();
        
        int[] agr1= new int[len];
        for(int i=0; i<agr1.length; i++)
        {
            System.out.println("Enter your scores");
            agr1[i]= input.nextInt();
        }
        
}
}