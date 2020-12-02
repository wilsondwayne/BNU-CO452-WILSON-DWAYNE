/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @dwayne wilson
 * @version 0.1
 */
public class StockApp
{
    public final int FIRST_ID = 111;
    // Use to get user input
    private InputReader input;

    private StockManager manager;

    private StockDemo demo;

    private int nextID = FIRST_ID;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);  
        sellProduct();
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getString("Please enter your choice");
            choice = choice.toLowerCase();

            if(choice.equals("quit"))
            {
                finished = true;
            }
            else
            {
                exeuteMenuChoice(choice);
            }
        }   
    }

    private void exeuteMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if (choice.equals("remove"))
        {
            removeProduct();
        }

        else if (choice.equals("printall"))
        {
            printAllProducts();
        }
        else if (choice.equals("sell"))
        {
            sellProduct();
        }
        else if (choice.equals("print low stock"))
        {
            
        }
        
        
       
    }

      
    /**
     * this method allows the user to add a product of their choice 
     */
    private void addProduct()
    {
        System.out.println("\nAdding a new product!\n");
        System.out.println();

        String name = input.getString("Please enter the product name ");

        Product product = new Product(nextID, name);
        manager.addProduct(product);

        System.out.println("Added a new product " + product);
        System.out.println("\nAdded " + product + " to the stock\n");

        nextID++;
    }

    /**
     * this method allows the user to remove a product of thier choice
     */
    private void removeProduct()
    {
        System.out.println("Remove an old product"); 
        System.out.println();

        int id = input.getInt("Please enter the id of the products ");

        manager.removeProduct(id);
    }

    /**
     * this method allows the user to remove a product of thier choice
     */
    private void sellProduct()
    {
        System.out.println("Sell an old product"); 
        System.out.println();

        int id = input.getInt("Please enter the id of the product ");

        int quantity = input.getInt("Please enter the quantity of the product ");

        manager.sellProduct(id, quantity);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();             
    }

    /**
     * this method allows the user to print out all of the stock 
     */
    public void printAllProducts()
    {
        manager.printAllProducts();
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Dwayne Wilson");
        System.out.println("******************************");
    }
}
