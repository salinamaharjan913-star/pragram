import java.util.Scanner;

/**
 * Write a description of class wq7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class wq7
{
    public static void main (String[] args){
    Scanner input= new Scanner(System.in);
    boolean choice = true;
    while(choice){
    System.out.println("Enter your first number: ");
    int a= input.nextInt();
    System.out.println("Enter your second number: ");
    int b= input.nextInt();
    System.out.println("Enter your arithematic operation (+, -, *, /):");
    char ari= input.next().charAt(0);
    int result;
    switch(ari){
   
        case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0)
                        result = a / b;
                    else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
    }
    break;
    default:
        System.out.println("Invalid operation!");
                    continue;
}
    System.out.println("Result:" +result);

    System.out.println("Do you want to continue? (true/false): ");
             choice = input.nextBoolean();
            }
}
        
    }

