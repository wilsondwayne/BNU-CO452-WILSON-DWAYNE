
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

    private int finalMark;

    private String finalGrade;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        this.title = title; 
        this.codeNo = codeNo;

        module1 = new Module("Programming Concepts", "C0452");
        module2 = new Module("Web Development ", "C0456");
        module3 = new Module("Networking", "C0459");
        module4 = new Module("User Experience", "C0460");

    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        else if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        else if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        else if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }

    public void print ()
    {
        System.out.println("Course: " + title + ", code number: " + codeNo);
        module1.print();

    }

    public Grades convertTograde(int mark)
    {

        if((mark >=0) && (mark < 40))
        {
            return Grades.F;
        }
        else if((mark >=40) && (mark < 50))
        {
            return Grades.D;
        }
        else if ((mark >=50) && (mark < 60))
        {
            return Grades.C;
        }
        else if ((mark >=60) && (mark < 70))
        {
            return Grades.B;
        }
        else if ((mark >=70) && (mark < 100))
        {
            return Grades.A;
        }

        return Grades.X;
    }
    
}

    
    
