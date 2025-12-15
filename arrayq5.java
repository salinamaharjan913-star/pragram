import java.util.Scanner;

/**
 * Write a description of class arrayq5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayq5
{
    public static void main(String[]args){
        String[] dis={"Morang","Kathmandu","Kaski","Sinduli"};
        for (int i=0; i<dis.length; i++){
            System.out.println(i+1 + ""+dis[i]);
        }
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your index length");
        int len= input.nextInt();
        
        String[] arr1= new String[len];
        
        for (int i=0; i< arr1.length; i++){
            System.out.println("Enter your districts");
            arr1[i]= input.next();
        }
        System.out.println("New Values");
        for (int l=0; l< arr1.length; l++){
        System.out.println(arr1[l]);
        
    }    
}
}