package Week11wk;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable
{
    public Wheat( double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return getlandArea() * 3.2;
    }

    @Override
    public double calculateWaterRequirement() {
        return getlandArea() * 2000; 
    }
    
    @Override
        public double calculateTransportCost(){
            return calculateYield() *  3;
        }
        
        @Override
        public String getTransportMethod(){
            return "Tractor";
        }
}