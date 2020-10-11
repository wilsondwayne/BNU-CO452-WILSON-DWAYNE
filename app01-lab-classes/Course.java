
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private String title;
    
    private String codeNumber;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNumber)
    {
        this.title = title; 
        this.codeNumber = codeNumber;
    }
    
    public void print ()
    {
        System.out.println("Course: " + title + ", code number: " + codeNumber);
 
    }
}
