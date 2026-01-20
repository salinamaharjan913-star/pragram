package Week11wk;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Rice extends Crop implements Transportable
{
    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    public double calculateYield() {
        return getlandArea() * 4.5; 
    }

    @Override
    public double calculateWaterRequirement() {
        return getlandArea() * 3000;
    }
    
    @Override
        public double calculateTransportCost(){
            return calculateYield() *  6;
        }
        
        @Override
        public String getTransportMethod(){
            return "Dozer";
        }

    
}
