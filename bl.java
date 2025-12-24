
/**
 * Write a description of class bl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bl
{
   public static void main(String[] args){
        String med1Eng = "Paracetamol";
        String med1Nep = "प्यारासिटामोल";
        double med1Price = 5.0;
        int med1Stock = 120;
        String med1Prescrip = "No";

        String med2Eng = "Cetirizine";
        String med2Nep = "सेटिरीजिन";
        double med2Price = 3.0;
        int med2Stock = 80;
        String med2Prescrip = "No";

        String med3Eng = "Amoxicillin";
        String med3Nep = "एमोक्सिसिलिन";
        double med3Price = 10.0;
        int med3Stock = 50;
        String med3Prescrip = "Yes";
        
        System.out.println("==================== MEDICINE INVENTORY REPORT ====================");
        System.out.println("Name (Nepali Name)         | Price | Stock | Prescription Required");
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println(med1Eng + " (" + med1Nep + ")  |  " + med1Price + "  |  " + med1Stock + "  |  " + med1Prescrip);
        System.out.println(med2Eng + " (" + med2Nep + ")  |  " + med2Price + "  |  " + med2Stock + "  |  " + med2Prescrip);
        System.out.println(med3Eng + " (" + med3Nep + ")  |  " + med3Price + "  |  " + med3Stock + "  |  " + med3Prescrip);
        
        System.out.println("---------------------------------------------------------");
        
    }
}
