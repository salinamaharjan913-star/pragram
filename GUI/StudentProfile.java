package GUI;
import javax.swing.*;


/**
 * Write a description of class StudentProfile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentProfile extends JFrame
{
    public StudentProfile()
    {
        setTitle("Student Profile");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            StudentProfile sd= new StudentProfile();
            sd.setVisible(true);
        });
    }
}