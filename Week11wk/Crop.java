package Week11wk;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  abstract class Crop
{
    private String cropName;
    private String season;
    private double landArea;
    
    public Crop(String cropName, String season, double landArea){
        this.cropName=cropName;
        this.season=season;
        this.landArea=landArea;
    }
    
    public String getcropName(){
        return this.cropName;
    }
     
    public void setcropName(String cropName){
        this.cropName=cropName;
        
    }
    
    public String getseason(){
        return this.season;
    }
     
    public void setseason(String season){
        this.season=season;
        
    }
    
    public double getlandArea(){
        return this.landArea;
    }
     
    public void setlandArea(double landArea){
        this.landArea=landArea;
        
    }
    
    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();
    
    public void displayCropInfo(){
        System.out.println("cropName: " + cropName);
        System.out.println("season: " + season);
        System.out.println("landArea: " + landArea);
        System.out.println("Yield:" + calculateYield());
        System.out.println("WaterRequirement:" + calculateWaterRequirement());
        
    }
        
    
}