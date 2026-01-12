package week10;


/**
 * Write a description of class NormalClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class NormalOrder extends Order {

    public NormalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    // Override method
    @Override
    public double calculateFinalAmount() {
        
        return super.calculateFinalAmount();
    }

    
    public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount() - discountAmount;
    }
}

