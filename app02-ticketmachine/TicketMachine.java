
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified dwayne wilson  
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private int price;

    private Ticket ticket;

    private  Ticket ticketToAylesbury;

    private Ticket ticketToAmersham;

    private Ticket ticketToHighWycombe;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        createTickets();
    }

    /**
     * 
     */
    private void createTickets()
    {
        ticketToAmersham = new Ticket("Amersham", 300); 
        ticketToAylesbury = new Ticket("Aylesbury", 220);  
        ticketToHighWycombe = new Ticket("High Wycombe", 330);
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                amount);
        }
    }

    public void selectAylesburyTicket()
    {  
        ticket = ticketToAylesbury;
    }
 
    public void selectAmershamTicket()
    {      
        ticket = ticketToAmersham;
    }

    public void selectHighWycombeTicket()
    {      
        ticket = ticketToHighWycombe;
    }

    public void printBalance(int amount)
    {   
        System.out.println("you have inserted " + amount + " pence");
        System.out.println("current balance = " + balance);
        
    }
    
    public void insert20p()
    {
        balance = balance + 20;
        printBalance(20);
    }   

    public void insert10p()
    {
        balance = balance + 10;
        printBalance(10);
    }

    public void insert200()
    {
        balance = balance + 200;
        printBalance(200);
    }

    public void insert100()
    {
        balance = balance + 100;
        printBalance(100);
    } 

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {

        if(balance >= price) 
        {
            // Simulate the printing of a ticket.         
            printHeading();
            ticket.print();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                (price - balance) + " more cents.");

        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    
    public void printAllTickets()
    {
        printHeading(); 
        ticketToAmersham.print();
        ticketToAylesbury.print();
        ticketToHighWycombe.print();

    }

    public void printHeading()
    {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("##################");
        System.out.println();
    }

}
