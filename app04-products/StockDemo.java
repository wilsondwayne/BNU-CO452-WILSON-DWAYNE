
import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by dwayne wilson 
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random randomGenerator;
   
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
        manager.addProduct(new Product(101,  "Apple iphone 12"));
        manager.addProduct (new Product(102,  "Apple iphone 8"));
        manager.addProduct(new Product(103,  "Samsung Galaxy S20"));
        manager.addProduct(new Product(104,  "Google Pixel 4A"));
        manager.addProduct(new Product(105,  "Samsung note S20"));
        manager.addProduct(new Product(106,  "Apple iphone 11"));
        manager.addProduct(new Product(107,  "Oneplus 8T"));
        manager.addProduct(new Product(108,  "Motorola Edge Plus"));
        manager.addProduct(new Product(109,  "Apple iphone SE"));
        manager.addProduct(new Product(110,  "Oppo Find X2 Pro"));
    }
    
    
    /**
     * this method will run all the test need to 
     * demonstrate that the requirements have been met
     */
   public void runDemo()
    {
         manager .printAllProducts();
         demoDeliverProducts();
         manager.printAllProducts();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoDeliverProducts()
    {
      int quantity = 0;
        
      for(int id = 101; id <= 110; id++) 
      {
          quantity = randomGenerator.nextInt(8);
          manager.deliverProduct(id, quantity); 
        }
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
