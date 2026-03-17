package Week19;


/**
 * Write a description of class Tasks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task
{

    private String name;
    private String priority;
    private boolean completed;

    public Task(String name, String priority) {
        this.name = name;
        this.priority = priority;
        this.completed = false;
    }

    public String getName() {
        return name; 
    }
    public String getPriority() {
        
     return priority; 
    }
    public boolean isCompleted() {
        return completed; 
    }
    public void setCompleted(boolean completed) 
    { this.completed = completed; 
    }
}
