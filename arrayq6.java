
/**
 * Write a description of class arrayq6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayq6
{
    public static void main(String[]args){
        int[][] marks={{90,65},{85,70}}; 
        String[] sub={"Nepali","English"};
        System.out.println("Student\t" +"Nepali\t"+"English\t");
        for(int i=0; i<marks.length; i++){
            System.out.print("S"+ (i+1) +"\t");
            for (int j=0; j<marks[i].length; j++){
                System.out.print(marks[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("\nTotal Marks of Each Student");
        for (int i=0; i<marks.length; i++){
            int total =0;
            for (int j=0; j<marks[i].length; j++){
                total = total+marks[i][j];
            }
            System.out.println("Student" +(i+1) +"Total = " +total);
        }
    }
        
        
        
}