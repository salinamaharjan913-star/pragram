package Week12;
import java.util.*;


/**
 * Write a description of class Names here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Names
{
    public static void main(String[] args){
    ArrayList<String> names = new ArrayList<>();
        
        names.add("Salina");
        names.add("Sabina");
        names.add("Sarina");
        names.add("rinal");
        names.add("Riya");
        
        for(String name:names){
            System.out.println(names);
        }
        
        //Iterator
        
        Iterator<String>it=names.iterator();
        while(it.hasNext()){
        String nam=it.next();
        System.out.println(nam);
        
}

//Remove element
names.remove("Sarina");
System.out.println("After removal: " +names);

System.out.println(names.get(2));
System.out.println(names.get(3));

}
}