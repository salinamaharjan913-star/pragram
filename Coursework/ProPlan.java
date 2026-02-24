package Coursework;


/**
 * Write a description of class ProPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProPlan extends AIModel
{
   
    private int teamSlots;

    public ProPlan(String modelName, double price,
                   int parameterCount, String contextWindow,
                   int teamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots = teamSlots;
    }

    public int getteamSlots() {
        return this.teamSlots;
    }
    
    }

    


