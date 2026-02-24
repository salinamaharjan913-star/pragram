package GUI;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window extends JFrame

{
    public Window()
    {
        JFrame frame= new JFrame();
        frame.setTitle("CS4001NI Programming");
        frame.setSize(400, 500);
        
        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("User Info"));
        //panel.setBackground(Color.CYAN);
        
        JLabel label= new JLabel("Username: ");
        label.setBounds(50, 50, 100, 30);
        
        JTextField txtField= new JTextField();
        txtField.setBounds(155, 50, 100, 30);
        
        JButton btn= new JButton("Submit");
        btn.setBounds(50, 90, 100, 30);
        btn.setBackground(new Color(255, 200, 0));
        btn.setForeground(Color.RED) ;
        
        panel.add(btn);
        panel.add(txtField);
        panel.add(label);
        panel.setLayout(null);
        add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
    }
    public static void main(String[] args){
        //JFrame frame= new JFrame();
        //frame.setTitle("CS4001NI Programming");
        //frame.setSize(400, 500);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
        
        Window wd= new Window();
        wd.setVisible(true);
    }
}