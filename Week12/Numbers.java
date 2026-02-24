package Week12;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    public static void main(String[] args){
    
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        for(Integer number:numbers){
            System.out.println(numbers);
        }
        
        //Iterator
        
        Iterator<Integer>it=numbers.iterator();
        while(it.hasNext()){
        Integer num=it.next();
        System.out.println(num);
        
    }
    
    //remove element
    numbers.clear();
System.out.println("After removal: " +numbers);
}
}
        
        
        