package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Write a description of class Ques1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryNoticeWindow extends JFrame
{
    public LibraryNoticeWindow()
    {
        
        setTitle("LibraryNotice");
        setSize(400, 300);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label= new JLabel("Library Opens at 7:00 AM ");
        label.setBounds(50, 50, 200, 30);
        
        add(label);
    }
    
    public static void main(String[] args){
        LibraryNoticeWindow wd= new LibraryNoticeWindow();
        wd.setVisible(true);
    }
}