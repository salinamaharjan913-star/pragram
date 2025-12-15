
/**
 * Write a description of class arrayq7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayq7
{
    public static void main(String[]args){
        String[][] seats= {{"abc","bcd","def"},{"","",""}};
        for (int i=0; i<seats.length; i++){
            for (int j=0; j<seats.length; j++){
                if (seats[i][j]==""){
                    System.out.print("[empty]/t");
                }
            
            else{
                System.out.print(seats[i][j]+"\t");}
            }
        }
    }
}
        
        
        