package Week11wk;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable
{
    
    public Maize( int landArea){
        super("Maize", "hill-friendly", landArea);
    }
        
        @Override 
        public double calculateYield(){
            return getlandArea() * 4;
        }
        @Override
        public double calculateWaterRequirement(){
            return getlandArea() * 1000;
        }
        
        @Override
        public double calculateTransportCost(){
            return calculateYield() *  5;
        }
        
        @Override
        public String getTransportMethod(){
            return "Bus";
        }
    }
