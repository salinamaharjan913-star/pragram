package Week18;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Ques1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRegistrationForm extends JFrame
{
    public StudentRegistrationForm(){
     setTitle("Student Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 10, 10));

        // 1. JTextField - Student Name, Age, Phone
        add(new JLabel("Student Name:"));
        add(new JTextField());

        add(new JLabel("Age:"));
        add(new JTextField());

        add(new JLabel("Phone Number:"));
        add(new JTextField());
        
        // 2. JComboBox - Department (12 options = 5+ so JComboBox)
        add(new JLabel("Department:"));
        String[] departments = {
            "Computer Science", "Information Technology",
            "Electronics", "Physician", "Nursing" , "Mechanical Enginerring",
            "Management"
        };
        add(new JComboBox<>(departments));

        // 3. JRadioButton - Gender (3 options = 2-4 so JRadioButton)
        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        JRadioButton male   = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other  = new JRadioButton("Other");
        ButtonGroup all = new ButtonGroup();  // only one can be selected
        all.add(male);
        all.add(female);
        all.add(other);
        genderPanel.add(male);
         genderPanel.add(female);
        genderPanel.add(other);
        add(genderPanel);

        // 4. JCheckBox - Hobbies (multi-select so JCheckBox)
        add(new JLabel("Hobbies:"));
        JPanel hobbiesPanel = new JPanel();
        hobbiesPanel.add(new JCheckBox("Reading"));
        hobbiesPanel.add(new JCheckBox("Swimming"));
        hobbiesPanel.add(new JCheckBox("Boxing"));
        hobbiesPanel.add(new JCheckBox("Gaming"));
        add(hobbiesPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
