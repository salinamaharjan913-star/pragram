
/**
 * Write a description of class arrays3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrays3
{
    public static void main(String[]args){
        int[] age; // declaring an array
        age= new int[5]; // constructing an array
        
        System.out.println(age.length); //finding length of an array
        
        // firstIndex=0, LastIndex=age.length-1=5-1=4;
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int[] agr={5,10,15,20,25}; //all in one
        
        System.out.println(agr.length); // 5
        
        System.out.println(agr[0]); // 5
        
        int sum=0;
        
        for(int i=0; i<agr.length; i++){
           sum= sum+ agr[i];
        }
        System.out.println(sum);
    }
}
