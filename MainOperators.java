
/**
 * Write a description of class MainOperators here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainOperators
{
    public static void main(String[]args){
    
    int a=15;
    int b=5;
     
    //Arithmetic Operators
    
    int sum= a+b;
    int sub= a-b;
    int div= a/b;
    int mult= a*b;
    
    System.out.println("Addition=" +sum);
    System.out.println("Difference=" +sub);
    System.out.println("Product=" +mult);
    System.out.println("Quotient=" +div);
    
    //Urinary Operators
    System.out.println(a++);
    System.out.println(++a);
    
    //Relational Operators
    
    int p=7;
    int q=5;
    
    System.out.println(p == q);
    System.out.println(p != q);
    System.out.println(p > q);
    System.out.println(p < q);
    
    //Assignment Operators
    int s=4;
    int t=2;
    int u=s+t;
    

    //logical Operators
    
    System.out.println(a>b && a != b);
    
    //Ternary Operators
    
    String isValid = (a>b) ? "A is greater than B" : "B is greater than A";
    System.out.println(isValid);
    
    
    
    
    
}
}