package Coursework;


/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    

    private int promptsRemaining;  //500 prompts per month

    public PersonalPlan(String modelName, double price,
                        int parameterCount, String contextWindow, //constructor
                        int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    public int getPromptsRemaining() {
        return promptsRemaining;
    }
    
    

}

