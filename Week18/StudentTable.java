package Week18;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class SrudentTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTable extends JFrame
{
    public StudentTable(){

        String[] columns = {"ID","Name","Age","Course"};

        Object[][] data = {
            {"1001","Sabina",20,"Computing"},
            {"1025","Albina",21,"BBA"},
            {"1043","Sarita",19,"IT"},
            {"1074","Rosyee",22,"Artist"}
        };

        JTable table = new JTable(data,columns);
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setDefaultEditor(Object.class,null);

        table.setRowHeight(25);
        
        JScrollPane scrollPane = new JScrollPane(table);///scrolling

        add(scrollPane);

        setTitle("Student Records");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new StudentTable();
    }
}
