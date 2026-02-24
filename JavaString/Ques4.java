package JavaString;


/**
 * Write a description of class Ques4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ques4
{
     public static void main(String[] args) {
        String name=" sAlina mAHARJAN ";
        String trimmedString= name.trim(); 
   
      String[] words= trimmedString.split("\\s+"); //["sAlina", "mAHARJAN"]
      StringBuilder sb= new StringBuilder () ;

for (String word: words){
String first= word.substring(0,1). toUpperCase(); 
String rest= word.substring(1).toLowerCase();
sb.append(first).append(rest).append("");
}

System.out.println(sb);
}
}