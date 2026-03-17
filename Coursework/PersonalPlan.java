package Coursework;


/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    

    private int promptsRemaining;  //500 prompts per month in monthy quota

    public PersonalPlan(String modelName, double price,
                        int parameterCount, String contextWindow, //constructor
                        int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    public int getPromptsRemaining() {
        return this.promptsRemaining;
    }
     
    public void purchasePrompts(int numberofPrompts) {

    if (numberofPrompts < 0) {
        System.out.println("You must enter positive value or upgrade to pro plan.");
    } 
    else {
        promptsRemaining = promptsRemaining + numberofPrompts;
        System.out.println("Prompts successfully added to the remaining monthly quota of user: "
                + promptsRemaining);
    }
}
    
   public String enterPrompt(String promptDetails, int tokenusage) {

    if (promptsRemaining > 0) {
        // Reduce quota by 1
        promptsRemaining = promptsRemaining - 1;  // or use monthlyPromptsRemaining-1;

        // Return details message
       return("Prompt Details "+ promptDetails + 
               "Token Usage: " + tokenusage +
               "Remaining Prompts: " + promptsRemaining);
    } 
    else {
        // Monthly quota reached
       return( "Monthly plan has been reached.");
    }
}
    


@Override
    public String display()
    {
        return super.display() +
               "Prompts Remaining (Monthly Quota): " + promptsRemaining;
    }
    
    
}

    
    


 
    
    



