package week10;


/**
 * Write a description of class PremiumClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class PremiumOrder extends Order {

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    // Override method
    @Override
    public double calculateFinalAmount() {
        // Premium orders get 15% discount
        double discount = super.calculateFinalAmount() * 0.15;
        return super.calculateFinalAmount() - discount;
    }

    // Overloaded method
    public double calculateFinalAmount(double extraDiscount) {
        return calculateFinalAmount() - extraDiscount;
    }
}

