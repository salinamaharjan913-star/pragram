import java.util.Scanner;

/**
 * Write a description of class ques11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques11
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Income Tax Calculator");
        System.out.println("2. Cinema Ticket Price Calculator");
        System.out.println("Enter your choice(1 or 2)");
        int choice = sc.nextInt();
        
        if (choice == 1){
            System.out.println("incometaxCalculator(sc)");
        }
        else if (choice == 2){
            System.out.println("cinemaTicketPriceCalculator(sc)");
        }
        else{
            System.out.println("Invalid choice");
        }
        //INCOME TAX CALCULATOR
        System.out.println("Enter your annual income (NPR)");
        double income = sc.nextDouble();
        double tax = 0;
        if (income <= 500000){
            tax = income *0.01;
        }
        else if (income <= 700000){
            tax = 5000 + (income - 500000) * 0.10;
        }
        else if (income <= 1000000) {
            tax = 5000 + 20000 + (income - 700000) * 0.20;
        }
        else if (income <= 2000000){
            tax = 5000 + 20000 + 60000 + (income - 1000000) * 0.30;
        }
        else if (income <= 5000000) {
            tax = 5000 + 20000 + 60000 + 300000 + 1080000 + (income - 5000000) * 0.39;
        }
        System.out.println("Total income tax payable: NPR" + tax);
        
    
        }
        
       //CINEMA TICKET PRICE CALCULATOR
       public class cinematicketcalculator {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String ageGroup = sc.next();
           System.out.println("Enter age group(child / adult / senior");
           
           String language = sc.next();
           System.out.println("Enter movie language(nepali / hindi / english");
           
           String isStudent = sc.next();
           System.out.println("Are you a student? (Yes / no): ");
           
           String isFestival = sc.next();
           System.out.println("Is today a festival day? (Yes / no):");
           
           double price = 0;
           //Base price by age
           switch(ageGroup) {
               case "child": price = 150; break;
               case "adult": price = 250; break;
               case "senior": price = 200; break;
               default:
                   System.out.println("Invalid age group entered.");
           }
           
           //Language Surcharge
           switch(language) {
               case "nepali"://no extra charge break;
               case "hindi":price += 50; break;
               case "english":price += 100; break;
               default:
                   System.out.println("Invalid movie language entered");
               
           }
           // Student discount 20%
           if (isStudent.equals("yes")) {
               price *= 0.80; //20% off
           }
           // Festival discount (15%)
           if (isFestival.equals("yes")){
               price *= 0.85; //15% off
               
           }
           System.out.println("Final ticket price: Rs. " + price);
           
}
} }