package Coursework;
import javax.swing.JFrame;


/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI extends JFrame
{
    public  GUI()
    {
        setTitle("AI subscription plans");
        setSize(400,500);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        
        PersonalPlan SA = new PersonalPlan("Salina", 265, 5, "64K", 500);
    System.out.println(SA.display());
    
    String promptResult = SA.enterPrompt("How are you?", 50);// store in variable
    System.out.println(promptResult);         // print the variable
   
    SA.purchasePrompts(50);
    System.out.println(SA.display());
    
    ProPlan team = new ProPlan("TeamArt", 500.0, 12, "128K", 3);
    System.out.println(team.addTeamMember("Beana"));
    System.out.println(team.addTeamMember("Sarina"));
    System.out.println(team.removeTeamMember("Beana"));
    System.out.println(team.display());
    
    }
    
}