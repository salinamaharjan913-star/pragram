package Week19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Write a description of class StudentDashboardUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class StudentDashboardUI extends JFrame {

    private JTextField taskField;
    private JComboBox<String> priorityBox;
    private JPanel taskPanel;
    private ArrayList<Task> tasks = new ArrayList<>();

    public StudentDashboardUI() {
        setTitle("Admin Dashboard");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ===== TOP PANEL =====
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(180, 200, 230));

        JLabel title = new JLabel("Admin Dashboard");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        topPanel.add(title);

        add(topPanel, BorderLayout.NORTH);

        // ===== LEFT PANEL (MENU) =====
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4, 1, 5, 5));

        JButton allBtn = new JButton("All Tasks");
        JButton completedBtn = new JButton("Completed");
        JButton pendingBtn = new JButton("Pending");
        JButton importantBtn = new JButton("Important");

        leftPanel.add(allBtn);
        leftPanel.add(completedBtn);
        leftPanel.add(pendingBtn);
        leftPanel.add(importantBtn);

        add(leftPanel, BorderLayout.WEST);

        // ===== CENTER PANEL =====
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel();

        taskField = new JTextField(15);
        String[] priorities = {"High", "Medium", "Low"};
        priorityBox = new JComboBox<>(priorities);

        JButton addButton = new JButton("Add Task");
        addButton.setBackground(Color.GREEN);

        inputPanel.add(new JLabel("Task:"));
        inputPanel.add(taskField);
        inputPanel.add(priorityBox);
        inputPanel.add(addButton);

        centerPanel.add(inputPanel, BorderLayout.NORTH);

        // Task display area
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(taskPanel);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        // ===== ACTION =====
        addButton.addActionListener(e -> addTask());
        
        tasks.add(new Task("Finish Java Assignment", "High"));
        tasks.add(new Task("Prepare Networking Notes", "Medium"));
        displayTasks();

        setVisible(true);
    }

    private void addTask() {
        String taskName = taskField.getText();
        String priority = (String) priorityBox.getSelectedItem();

        if (taskName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a task!");
            return;
        }

        Task task = new Task(taskName, priority);
        tasks.add(task);

        displayTasks();
        taskField.setText("");
    }

    private void displayTasks() {
        taskPanel.removeAll();

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            int index = i;

            JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));

            JCheckBox check = new JCheckBox(task.getName());
            JButton deleteBtn = new JButton("Delete");
            deleteBtn.setBackground(Color.PINK);

            check.addActionListener(e -> {
                task.setCompleted(check.isSelected());
            });

            deleteBtn.addActionListener(e -> {
                tasks.remove(index);
                displayTasks();
            });

            row.add(check);
            row.add(deleteBtn);

            taskPanel.add(row);
        }
        
        

        taskPanel.revalidate();
        taskPanel.repaint();
    }

    public static void main(String[] args) {
        new StudentDashboardUI();
    }
}