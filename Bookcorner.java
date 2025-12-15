
/**
 * Write a description of class Bookcorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bookcorner
{
    public static void main(String[] args)
    {
        String[] categories={"Friction", "Nepali"};
        String[][] titles= new String[2][1];
        double[][] prices= new double[2][1];
        
        titles[0][0]="Asahamati-5";
        prices[0][0]=750.0;
         
        titles[1][0]="Cafe";
        prices[1][0]=500.25;
        
       
            

    for(int i = 0; i < categories.length ; i++){
    System.out.print(categories[i]+"  ");
        for(int j = 0 ; j < titles[i].length ; j++){
        if(titles[i][j] == null || titles[i][j] == ""){
        System.out.println("[empty]");
        }
        else{
        System.out.print(titles[i][j]+ " ");
        System.out.printf("%.2f",prices[i][j]);
        }
        
        }
        System.out.println();
    }
    System.out.println();
    
    }
}
