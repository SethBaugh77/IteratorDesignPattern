package IteratorDesignPattern;

/**
 * This class represents an item that will be put in the wishlist. 
 * @author Seth Baugh
 */
public class Item {

    private String title;
    private String description;
    private double price;

    /**
     * Constructor that creates an item with the indicated attributes.
     * @param _title What the item is.
     * @param _description More specific version of the title.
     * @param _price how much it costs.
     */
    public Item(String _title, String _description, double _price) {
        title = _title;
        description = _description;
        price = _price;

    }

    /**
     * Returns description of the item. 
     * @return String representatin of description.
     */
    public String toString() {
        return description;
    }

    /**
     * Returns price of the item. 
     * @return Double representatin of the price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method that calls to other methods that when combined print out the required
     * data.
     */
    public void print() {
        System.out.println();
        System.out.println("**** " + title + " ****");
        System.out.println(toString());
        System.out.println("Price: $" + getPrice());

    }

}
