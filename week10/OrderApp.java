package week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
 {
    public static void main(String[] args) {

        NormalOrder normalOrder = new NormalOrder(6891, "Salina", 51000);
        PremiumOrder premiumOrder = new PremiumOrder(4102, "Sabina", 85000);

        System.out.println("----- Normal Order Invoice -----");
        System.out.println(normalOrder);
        System.out.println("Final Amount: " + normalOrder.calculateFinalAmount(500));

        System.out.println("\n----- Premium Order Invoice -----");
        System.out.println(premiumOrder);
        System.out.println("Final Amount: " + premiumOrder.calculateFinalAmount(300));
    }
}

    
