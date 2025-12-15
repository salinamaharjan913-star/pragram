
/**
 * Write a description of class arrays4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrays4
{

public static void main(String[]args){
    // 2D Array
    
    int[][] matrix= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    
    System.out.println(matrix.length); // length=4, index= length-1=3
    
    for(int i=0; i<matrix.length; i++)
    {
       System.out.println(matrix[i]); 
    }
    
    
}
}