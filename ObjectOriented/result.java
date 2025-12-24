package ObjectOriented;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


    public class result
{
    int sub1;
    int sub2;
    int sub3;
    
    public result ( int sub1, int sub2,int sub3){
    
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    
    public void total(){
    int totMarks = sub1 + sub2 + sub3;
    double percentage = (totMarks / 3);
    System.out.println("Total=" +totMarks);
    System.out.println("Percentage=" +percentage);
    System.out.println();
    }
}

