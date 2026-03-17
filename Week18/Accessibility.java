package Week18;
import javax.swing.*;
import java.awt.event.*;


/**
 * Write a description of class JScrollPlane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accessibility extends JFrame
{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Accessibility Example");

        JButton saveButton = new JButton("Save");

        // Keyboard shortcut
        saveButton.setMnemonic(KeyEvent.VK_S);

        // Tooltip help text
        saveButton.setToolTipText("Click to save the record");

        frame.add(saveButton);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}