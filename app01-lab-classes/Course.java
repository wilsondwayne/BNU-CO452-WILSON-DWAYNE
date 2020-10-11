
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
        title = title; 
        codeNumber = codeNumber;
    }
    
    public void print ()
    {
        System.out.println(title + ", code number: " + codeNumber);
 
    }
}
