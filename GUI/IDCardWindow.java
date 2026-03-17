package GUI;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;



/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCardWindow extends JFrame
{
    public IDCardWindow(Student aa)
    {
        setTitle("IDCardWindow");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        JLabel label= new JLabel(aa.getFormattedDetails());
        label.setBounds(10, 10, 280, 130);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        // create a panel for a box
        JPanel panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(105, 80 , 300, 150);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(Color.WHITE);
        
        
        
        add(label);
        add(panel);
        panel.add(label);
        setLayout(null);
        setResizable(false);
        
        
        
        
        
            }
    
}