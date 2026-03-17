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
    
      public String addTeamMember(String name) {
        if (teamSlots > 0) {
            teamSlots= teamSlots-1;
            return "Team member " + name + " added. Remaining slots: " + teamSlots;
        } else {
            return "No available slots remaining.";
        }
    }

    public String removeTeamMember(String name) {
        teamSlots= teamSlots+1;
        return "Team member " + name + " removed. team slots: " + teamSlots;
    }

    @Override
    public String display() {
        return super.display() +
                "Available Team Slots: " +teamSlots;
    }
    
}

    


