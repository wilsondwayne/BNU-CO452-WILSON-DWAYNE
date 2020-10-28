import java.util.Date;
/**
 * Write a description of class Tickect here.
 *
 * @author Dwayne Wilson
 * @version (a version number or a date)
 */
public class Ticket
{
    // journey destination
    private String destination;
    
    // this the ticket price in pence
    private int price;
    
    //the date and time the ticket was issued
    private Date timeStamp;
    
    /**
     *Constructor for objects of class Tickect
     *
     */
    
    public Ticket(String destination,int price)
    {
        timeStamp =new Date();
        this.destination = destination;
        this.price = price;
    }
    
    
   /**
    * 
    *
    */
   public void print()
   {
       System.out.print("Ticket to " + destination); 
       System.out.print(" cost " + price + "p ");
       System.out.println("Issued; " + timeStamp);
 }
}