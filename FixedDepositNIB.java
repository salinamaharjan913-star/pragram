import java.util.Scanner;

/**
 * Write a description of class wq10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {

            System.out.println("\n--- NIB Fixed Deposit Calculator ---");

            // Input principal
            System.out.print("Enter deposit amount (minimum 1000): ");
            double P = sc.nextDouble();

            // Input interest rate
            System.out.print("Enter annual interest rate (8 - 12): ");
            double rate = sc.nextDouble();

            // Input years
            System.out.print("Enter number of years (max 5): ");
            int years = sc.nextInt();

            // Convert years to months
            int months = years * 12;

            // Monthly interest rate
            double monthlyRate = rate / 12 / 100;

            // Monthly compounding
            double amount = P;
            int i = 1;

            while (i <= months) {
                amount = amount + (amount * monthlyRate);
                i++;
            }

            // Processing fee
            double fee = amount * 0.005;

            // Final amount
            double finalAmount = amount - fee;

            System.out.println("\n--- FINAL RESULT ---");
            System.out.println("Principal Amount: Rs. " + P);
            System.out.println("Maturity Before Fee: Rs. " + amount);
            System.out.println("Processing Fee: Rs. " + fee);
            System.out.println("Final Amount: Rs. " + finalAmount);

            System.out.print("\nDo you want to calculate again? (yes/no): ");
            again = sc.next();

        } while (again.equalsIgnoreCase("yes"));

        sc.close();
    }
}

