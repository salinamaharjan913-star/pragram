
/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Q7aushadipasal
{
    public static void main(String[] args) {
        String medicine1= "name:paracetamol1, Qty:25, Price:50\n";
        String medicine2= "name:paracetamol2, Qty:30, Price:60\n";
        String medicine3= "name:paracetamol3, Qty:75, Price:100 \n";
        
        System.out.println("welcome");
        Scanner x =new Scanner (System.in);
        int alpha = x.nextInt();
        if (alpha==1){
        System.out.println(medicine1);
    }
        else if (alpha==2){
    
        System.out.println(medicine2);
    }
        else if  (alpha==3){
        System.out.println(medicine3);
    }else{
    System.out.println("medicine3");
    }
    }
    
}