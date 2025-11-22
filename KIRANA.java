
/**
 * Write a description of class KIRANA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KIRANA
{ 
    int qty;// instone variable
    static int rrt; // static variable
    
    public static void main(String[] args){
        int age=18;//local  variable
        System.out.println(age);
        System.out.println(KIRANA.rrt);
        
        //Implicit Typecasting
        
        double dtr=age;
        System.out.println(dtr);
        
        //Explicit Typecasting
        
        double db=10.08;
        int itr=(int)db;
        System.out.println(itr);
        
        //Exception in arthimetic
        
        byte b1=10;
        byte b2=11;
        
        byte sum= (byte)(b1+b2);
        
        //short,char
        
        
        
        // Minimum,maximum,size,bytes
        
        System.out.println(Byte.MAX_VALUE);//maximum value
        System.out.println(Byte.MIN_VALUE);//minimum value
        System.out.println(Byte.SIZE);//byte
        System.out.println(Byte.BYTES);//bytes
        
        //Escape Sequence
        
        System.out.println("Hello\nWorld");
        System.out.println("Hello\bWorld");
        System.out.println("She said \"Hi \" ");
        
        //Unicode Escape Sequence
        
        System.out.println("\u2764");
        
        
        
        System.out.println(Double.MAX_VALUE);//maximum value
        System.out.println(Double.MIN_VALUE);//minimum value
        System.out.println(Double.SIZE);//byte
        System.out.println(Double.BYTES);//bytes
        
        
    }
}