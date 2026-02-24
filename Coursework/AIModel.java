package Coursework;


/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel
{
        private String modelName;
    private double price; //in NPR per 1 Lakh tokens
    private int parameterCount;//in billions
    private String contextWindow;//64 tokens

    public AIModel(String modelName, double price, int parameterCount, String contextWindow) {
        this.modelName = modelName;
        this.price = price; 
        this.parameterCount = parameterCount; 
        this.contextWindow = contextWindow;
    }

    public String getModelName() {
        return this.modelName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getParameterCount() {
        return this.parameterCount;
    }

    public String getContextWindow() {
        return this.contextWindow;
    }

    @Override
    public String toString() {
        return "modelName: "+ modelName +
               "Price: "+price + 
               "ParameterCount: "+ parameterCount +
               "ContextWindow: "+contextWindow;
    }
    
    
}

