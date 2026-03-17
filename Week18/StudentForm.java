package Week18;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


/**
 * Write a description of class StudentForm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    

class Student {
    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;

    public static ArrayList<Student> studentList = new ArrayList<>();

    public Student(int id, String name, String gender, String skill, String course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }

    public int getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }
    public String getGender() { 
        return gender; 
    }
    public String getSkill() { 
        return skill; 
    }
    public String getCourse() { 
        return course; 
    }

    public static boolean addStudent(Student s) {
        for(Student st : studentList) {
            if(st.getId() == s.getId()) return false;
        }
        studentList.add(s);
        return true;
    }

    public static boolean deleteStudent(int id) {
        return studentList.removeIf(s -> s.getId() == id);
    }
}
public class StudentForm extends JFrame {

    String[] buttons = {"Add", "Reset", "Search", "Delete", "View"};

    public StudentForm() {
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Welcome! Admin");
        titlePanel.add(titleLabel);

        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        sidebarPanel.add(Box.createVerticalGlue());
        for(String btn : buttons) {
            JButton button = new JButton(btn);
            button.setMaximumSize(new Dimension(120,30));
            sidebarPanel.add(button);
            sidebarPanel.add(Box.createVerticalStrut(10));
        }
        sidebarPanel.add(Box.createVerticalGlue());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        JPanel row1 = new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel idLabel = new JLabel("Student ID: ");
        JTextField txtID = new JTextField(15);
        txtID.setMaximumSize(new Dimension(120,30));
        row1.add(idLabel);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(txtID);
        formPanel.add(row1);

        JPanel row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel nameLabel = new JLabel("Name: ");
        JTextField txtName = new JTextField(15);
        txtName.setMaximumSize(new Dimension(150,30));
        row2.add(nameLabel);
        row2.add(Box.createHorizontalStrut(10));
        row2.add(txtName);
        formPanel.add(row2);

        JPanel row3 = new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        row3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel genderLabel = new JLabel("Gender: ");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        row3.add(genderLabel);
        row3.add(Box.createHorizontalStrut(10));
        row3.add(male);
        row3.add(female);
        row3.add(other);
        formPanel.add(row3);

        JPanel row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        row4.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel courseLabel = new JLabel("Course: ");
        String[] courses = {"BSc","BBA","BIT"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        row4.add(courseLabel);
        row4.add(Box.createHorizontalStrut(10));
        row4.add(courseBox);
        formPanel.add(row4);
        
        JPanel row5 = new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
        row5.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel skillLabel = new JLabel("Skills: ");
        JTextField txtSkill = new JTextField(15);
        txtSkill.setMaximumSize(new Dimension(150,30));
        row5.add(skillLabel);
        row5.add(Box.createHorizontalStrut(10));
        row5.add(txtSkill);
        formPanel.add(row5);
        
        String[] columns = {"ID","Name","Gender","Skill","Course"};
        Object[][] data = {};
        JTable table = new JTable(data, columns);
        table.setEnabled(false);
        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setPreferredSize(new Dimension(350,400));

        add(titlePanel, BorderLayout.NORTH);
        add(sidebarPanel, BorderLayout.WEST);
        add(formPanel, BorderLayout.CENTER);
        add(tableScroll, BorderLayout.EAST);

        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentForm().setVisible(true);
        });
    }
}
