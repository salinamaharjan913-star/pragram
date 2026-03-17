package Week19;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Form here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Form extends JFrame
{
    String[] buttons={"Add", "Edit", "Delete", "View"};
    private JPanel titlePanel;
    public Form()
    {
        setTitle("Layout Demo");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel titlePanel= new JPanel();
        JLabel titleLabel= new JLabel("Welcome ADMIN!");
        
        add(titlePanel, BorderLayout.NORTH);
        titlePanel.add(titleLabel);
        
        JPanel sidebarPanel= new JPanel();
        sidebarPanel.add(Box.createVerticalGlue());
        
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        for(String btn: buttons){
            JButton button= new JButton(btn);
            button.setMaximumSize(new Dimension(120, 40));
            sidebarPanel.add(button);
            sidebarPanel.add(Box.createVerticalStrut(10));
        }
        sidebarPanel.add(Box.createVerticalGlue());
        
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        
        JPanel row1= new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel row2= new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel row3= new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        row3.setAlignmentX(Component.LEFT_ALIGNMENT);

        
                
        JLabel nameLbl= new JLabel("Name");
        JTextField txtName= new JTextField(15);
        
        row1.add(nameLbl);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(txtName);
        txtName.setMaximumSize(new Dimension(100, 30));
        
        JLabel genderLbl= new JLabel("Gender: ");
        
        ButtonGroup btnGrp= new ButtonGroup();
        
        JRadioButton maleBtn= new JRadioButton("Male");
        JRadioButton femaleBtn= new JRadioButton("Female");
        JRadioButton otherBtn= new JRadioButton("Others");
        
        JLabel courseLbl = new JLabel("Course: ");
        
        String[] courses = {"Computing", "BBA", "BHM", "BIT"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        
        
       row3.add(courseLbl);
       row3.add(Box.createHorizontalStrut(10));
       row3.add(courseBox);
       
        JPanel row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        row4.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel hobbyLbl = new JLabel("Hobby: ");
        String[] hobbies = {"Sports", "Music", "Travel", "Reading"};
        JComboBox<String> hobbyBox = new JComboBox<>(hobbies);
        row4.add(hobbyLbl);
        row4.add(Box.createHorizontalStrut(10));
        row4.add(hobbyBox);




        
    
        
        btnGrp.add(maleBtn);
        btnGrp.add(femaleBtn);
        btnGrp.add(otherBtn);
        
        row2.add(genderLbl);
        row2.add(maleBtn);
        row2.add(femaleBtn);
        row2.add(otherBtn);
        
        
        
        
        formPanel.add(row1);
        formPanel.add(row2);
        formPanel.add(row3);
        formPanel.add(row4);
        
        add(formPanel, BorderLayout.CENTER);
        
        add(sidebarPanel, BorderLayout.WEST);
        add(titlePanel, BorderLayout.NORTH);
        pack();
        
    
        
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->
        {
            new Form().setVisible(true);
        });
}
}