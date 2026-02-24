package JavaString;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{
     public static Student[] parseCSV(String[] csvData){
        Student[] students = new Student[csvData.length - 1];
        int index = 0;
       
        for(int i = 1; i < csvData.length; i++){
            String[] parts = csvData[i].split(",");
           
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());
            String school = parts[2].trim();
            int grade = Integer.parseInt(parts[3].trim());
            String citizenship = parts[4].trim();
            String phone = parts[5].trim();
           
            students[index++] = new Student(name, age, school, grade, citizenship, phone);
        }
        return students;
    }
   
    public static boolean isValidCitizenship(String cit){
        if(cit.length() != 10){
            return false;
        }
        if(cit.charAt(2) != '-'){
            return false;
        }
        if(!Character.isDigit(cit.charAt(0)) || !Character.isDigit(cit.charAt(1))){
            return false;
        }
        for(int i = 3; i < 10; i++){
            if(!Character.isDigit(cit.charAt(i))){
                return false;
            }
        }
        return true;
    }
   
    public static void findBySchool(Student[] students, String school){
        for(Student s : students){
            if(s.getSchool().equalsIgnoreCase(school)){
                System.out.println(s);
            }
        }
    }
   
    public static int countByGrade(Student[] students, int grade){
        int count = 0;
        for(Student s : students){
            if(s.getGrade() == grade){
                count++;
            }
        }
        return count;
    }
   
    public static double averageAge(Student[] students){
        int sum = 0;
        for(Student s : students){
            sum = sum + s.getAge();
        }
        return sum / students.length;
    }
   
    public static Student findLongestName(Student[] students){
        Student longest = students[0];
        for(Student s : students){
            if(s.getName().length() > longest.getName().length()){
                longest = s;
            }
        }
        return longest;
    }
   
    public static String generateCensusReport(Student[] students){
        StringBuilder report = new StringBuilder();
        report.append("\n==== Nepal School Census Report ====\n");
        int valid = 0, invalid = 0;
       
        for(Student s : students){
            if(isValidCitizenship(s.getCitizenship())){
                valid++;
            }
            else{
                invalid++;
            }
        }
        report.append("Total Students: ").append(students.length);
        report.append("\nValid Citizenship: ").append(valid);
        report.append("\nInvalid Citizenship: ").append(invalid);
       
        report.append("\n- Student List -\n");
        for(Student s : students){
            boolean ok = isValidCitizenship(s.getCitizenship());
            report.append(String.format("%s %s Age: %d Grade: %d %s\n",s.getNameInitials(), s.getName(), s.getAge(), s.getGrade(), ok ? "Valid" : "Invalid" ));
        }
        report.append("\nAverage Age: ").append(String.format("%.2f", averageAge(students)));
        report.append("\n Longest Name: ").append(findLongestName(students).getName());
       
        return report.toString();
    
    }
}

