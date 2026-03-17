package GUI;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class CollegeEvent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeEvent extends JFrame
{
    public CollegeEvent(){
        
    
        JLabel label= new JLabel("Welcome to Orientation Day ");
        setSize(500,400);
        
        
        JPanel panel=new JPanel();
        panel.setBackground(Color.BLUE);
       
        
        panel.add(label);
        add(panel);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        CollegeEvent wd= new CollegeEvent();
        wd.setVisible(true);
}
}
