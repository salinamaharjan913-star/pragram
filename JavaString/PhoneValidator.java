package JavaString;


/**
 * Write a description of class PhoneValidator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneValidator
{
    
    public static boolean isValidPhone(String phone) {
        // Regex: starts with 97 or 98 and must be exactly 10 digits
        return phone.matches("^(97|98)\\d{8}$");
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidPhone("9841234567")); // true
        System.out.println(isValidPhone("1234567890")); // false
        System.out.println(isValidPhone("98412345"));   // false
        System.out.println(isValidPhone("98-412-345")); // false
    }
}
