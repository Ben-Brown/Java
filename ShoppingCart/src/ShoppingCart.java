/**
 * File: ShoppingCart.java
 * Description:  Creates and keeps track of items and total cost of a "shopping cart" of items.
 * Created by Ben Brown on 1/10/2015.
 */
public class ShoppingCart {
    final int maxItems = 10;
    //Passes LineItems into an array;
    private LineItem[] itemArray;
    private int totalItems;
    private double totalCost;

    public ShoppingCart()
    {
        totalItems = 0;
        totalCost = 0;
        itemArray = new LineItem[maxItems];
    }

    public void add(LineItem newItem)
    {
        if (totalItems <= maxItems)
        {
            itemArray[totalItems] = newItem;
            this.totalItems++;
            this.totalCost += newItem.getCost();
        }
    }

    public double getTotalCost ()
    {
        return this.totalCost;
    }
}
