package GUI;


/**
 * Write a description of class Model here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student 
{
    
        private String studentid; //attributes
        private String name;
        private String course;
        
        public Student(String studentid, String name, String course){
            this.studentid=studentid;
            this.name=name;
            this.course=course;
        }
       
        public String getFormattedDetails(){
            return "<html><body><p>Student ID Card</p><b>ID:</b>SR45 <br><b>Name:</br>Sabina <br> <b>Course:</b> Biology <br></br <br></br <b>ID:</b>S5475 <br><b>Name:</br>Smriti <br> <b>Course:</b> AritificialIntelligence</body></html>";
                   
    
}
}