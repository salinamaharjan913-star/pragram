package Week18;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class InputValidation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputValidation extends JFrame
{
    JTextField nameField, ageField, phoneField;
    JLabel errorLabel;
    public InputValidation(){
        
        
        setTitle("Validation Form");
        setSize(200,100);
        setLayout(new GridLayout(5, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        add(new JLabel("Student Name:"));
        add(new JTextField());

        add(new JLabel("Age:"));
        add(new JTextField());

        add(new JLabel("Phone Number:"));
        add(new JTextField());
        
        JButton submitBtn = new JButton("Submit");
        add(submitBtn);
        
        add(new JLabel("errorLabel:"));
        errorLabel.setForeground(Color.BLACK);
        add(errorLabel);

        submitBtn.addActionListener(e -> validateInputs());

        pack();
        setVisible(true);
    }

    private void validateInputs() {
        String name  = nameField.getText().trim();
        String age   = ageField.getText().trim();
        String phone = phoneField.getText().trim();

        // 1. Presence check (empty fields)
        if (name.isEmpty()) {
            errorLabel.setText("Name cannot be empty!");
            nameField.setBackground(Color.PINK); // UI highlights the error field
            return;
        }

        // 2. Type check (age must be numeric)
        int ageValue;
        try {
            ageValue = Integer.parseInt(age);
        } catch (NumberFormatException ex) {
            errorLabel.setText("Age must be a number!");
            ageField.setBackground(Color.PINK);
            return;
        }

        // 3. Range check (valid age: 1 to 120)
        if (ageValue < 1 || ageValue > 120) {
            errorLabel.setText("Age must be between 1 and 120!");
            ageField.setBackground(Color.PINK);
            return;
        }

        // 4. Format check (phone: digits only, 10 characters)
        if (!phone.matches("\\d{10}")) {
            errorLabel.setText("Phone must be 10 digits only!");
            phoneField.setBackground(Color.PINK);
            return;
        }

        // All valid
        errorLabel.setForeground(Color.GREEN);
        errorLabel.setText("All inputs are valid!");
        nameField.setBackground(Color.CYAN);
        ageField.setBackground(Color.CYAN);
        phoneField.setBackground(Color.CYAN);
    }

    public static void main(String[] args) {
        new InputValidation();
    }
}
    