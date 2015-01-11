/**
 * File: LineItem.java
 * Description:  Stores item names, quantities, and price.  Calculates the item total by multiplying price by quantity
 * Created by Ben on 1/10/2015.
 */
public class LineItem {
    //Private variables
    private String name;
    private int quantity;
    private double pricePerUnit;

    //Constructor to input user information
    public LineItem(String name, int quantity, double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    //Getter to retrieve cost of LineItem;
    public double getCost()
    {
        double priceTotal;
        //Multiplies quantity by pricePerUnit
        priceTotal = this.quantity * this.pricePerUnit;
        return priceTotal;
    }

    //Setter for quantity of LineItem
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }
}
