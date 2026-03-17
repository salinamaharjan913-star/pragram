package Week18;

import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class StateManagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StateManagement extends JFrame
{
    JTextField nameField, ageField, phoneField;
    JButton submitButton;
    public StateManagement() {

        setTitle("Management");
        setSize(300,200);
        setLayout(new GridLayout(4,2));

        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel phoneLabel = new JLabel("Phone:");

        nameField = new JTextField();
        ageField = new JTextField();
        phoneField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.setEnabled(false);   // disabled at start

        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(phoneLabel);
        add(phoneField);
        add(new JLabel(""));
        add(submitButton);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        
        public static void main(String[] args) {
        new StateManagement();
    }
}
