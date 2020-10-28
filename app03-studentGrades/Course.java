
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private String title;
    private String codeNo;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNumber)
    {
        this.title = title; 
        this.codeNo = codeNo;
        
        
        module1 = new Module("Programming Concepts", "C0452");
        module2 = new Module("Programming Concepts", "C0452");
        module3 = new Module("Programming Concepts", "C0452");
        module4 = new Module("Programming Concepts", "C0452");

    }
    
    public void addModule(Module module, int moduleNo)
    {
    }
    
    public void print ()
    {
        System.out.println("Course: " + title + ", code number: " + codeNo);
 
    }
}
