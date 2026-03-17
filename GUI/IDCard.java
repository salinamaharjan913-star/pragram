package GUI;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class IDCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCard extends JFrame
{
    public IDCard()
    {
        setTitle("IDCard");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel= new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Student Details"));
        panel.setBounds(20,30,400,400);
        
        String htmlText= "<html><body><divstyle='text-align:right'><p>Student Name: Salina</p> <p>Module: Programming</p> <p>College: Islington</p></div></body></html>";
        
        JLabel label = new JLabel(htmlText);
        label.setVerticalAlignment(SwingConstants.CENTER);
        
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setBounds(20,20,300,300);
        
        panel.add(label);
        add(panel);
        setLocationRelativeTo(null);
        setLayout(null);//frame layout
        panel.setLayout(null);
        
        
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->
        {
            IDCard I= new IDCard();
            I.setVisible(true);
        });
        
    }
    
}