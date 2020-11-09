import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author dwayne wilson 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**if the name of the product has to be changed use this change the name of the product
     * 
     */

    public void chnageProductName(int id, String replacement) 
    {
    {Product product = findProduct(id);
        if(product != null)
        {
            product.setName(replacement);
        }
        else
        {
            System.out.println( " Product not found on database");
        }

    }
    }
    
    /** if product is no longer part of the stock method remove
     * it from the array list 
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            stock.remove(product);
            System.out.println("the product has been removed from the stock.");
        }
        else
        {
            System.out.println(" Product not found on the database");
        }
    }

    /**this is a method check on the level of the stock
     * if it is low print it on the terminal 
     */
    public void printLowStock()
    {
        for(Product stocks : stock)
        {
            if (stocks.getQuantity() < 2) 
            {
                System.out.println(stocks);
            }
        }
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        {  
            if (product != null && amount > 0)
            {
                product.increaseQuantity(amount);
                product.getQuantity();
                System.out.println(product);
                product.deliver(amount); 
            }
            else
            {
                System.out.println("invalid product ID = " + id);
            }
        }

    }

    /**
     * sell one of the given item.
     * show before and after status of the product
     * @param id The ID of the product being sold
     */
    public void sellOne(int id)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            printProduct(id);

            // to be changed
            product.sellOne();

            printProduct(id);
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() ==id)
            {
                return product;
            }
            else
            {
                System.out.println( " product not found on the database");
            }
        }

        return null;
    }

    /**
     * print deatils of a given product.if found
     * its name and stock quantity will be shown
     * @param id the ID of the product to look for
     */
    public void printProduct(int id)
    { 
        Product product = findProduct(id); 
        
        if( product != null) 
        {
            System.out.println(product);
        }
    }

    /** Print product by search with name String 
     * 
     * 
     */
    public void printByName(String name)
    {
        String text = "Samsung Galaxy";
        
        if(text.contains(name))
        {
        }
   
    }

    /**This method finds products from stock and sells it to customers
     * 
     */
    public void sellProduct(int id, int sale)
    {
        Product product = findProduct(id);
        
        if(product!= null)
        {
            System.out.println( "Available stock :" + product.getQuantity());
            product.sell(sale);
            System.out.println(product);
        }
        else
        {
            System.out.println( "product not found");
        }
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public void numberInStock(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            System.out.println(" the stock quantity is :" + product.getQuantity()); 
            product.getQuantity();
        }
        else
        {
            System.out.println(" the system does not find the product");
        }
    }



    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        printHeading();

        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }

    public void printHeading()
    {
        System.out.println();
        System.out.println("Dwayne's Stock List");
        System.out.println("====================");
        System.out.println();
    }
}
