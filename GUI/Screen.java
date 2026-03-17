package GUI;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class Screen extends JFrame
{
    public Screen()
    {
        setTitle("Login Window");
        setSize(500,500);
        
        JPanel panel= new JPanel();
        
        Label label= new Label("Username:");
        label.setBounds(50, 50, 100, 30);
        
        JTextField txtField= new JTextField();
        txtField.setBounds(150,50,150,30);
        
        JButton btn= new JButton("Submit");
        btn.setBounds(150, 100, 100, 30);
        btn.setBackground(Color.PINK);
        
        panel.add(btn);
        panel.add(txtField);
        panel.add(label);
        panel.setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main (String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            Screen N=new Screen();
            N.setVisible(true);
        });
    }
}
