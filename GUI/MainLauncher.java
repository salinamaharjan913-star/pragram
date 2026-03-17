package GUI;

import javax.swing.SwingUtilities;

/**
 * Write a description of class MainLauncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainLauncher
{
    public static void main(String [] args){
        SwingUtilities.invokeLater(()->
        {
        
        Student s1= new Student("SR45", "Sabina", "Biology");
        Student s2= new Student("S5475", "Smriti", "Aritificial Intelligence");
        IDCardWindow t1= new IDCardWindow(s1);
        IDCardWindow t2= new IDCardWindow(s2);
    });
}
}