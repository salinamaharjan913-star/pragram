package JavaString;


/**
 * Write a description of class Ques2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ques2
{
    public static void main(String[] args){
        String str = "      Hello World       ";
        String clean = str.trim();
        System.out.println(str.substring(0,10));
        System.out.println("Trimmed string: "+clean);
        
        String[] splitString = str.split(" ");
        
        for(String x : splitString){
            System.out.println(x);
        }
}
}