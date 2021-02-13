package IteratorDesignPattern;

/**
 * Class that represents a WishList. 
 * @author Seth Baugh
 */
public class WishList {
    private String name;
    private Item[] items = new Item[5];
    private int count;

    /**
     * Constructor that creates a WishList with the inteded attributes.
     * @param _name of the WishList.
     */
    public WishList(String _name) {
        name = _name;
    }

    /**
     * Method that takes in parameters that are the attributes of an item in the WishList.
     * @param title what the item is called.
     * @param desc specific version of the title.
     * @param price how much item costs.
     */
    public void addItem(String title, String desc, double price) {
        Item item = new Item(title, desc, price);
        for (int i = 0; i < 5; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }

    /**
     * Method that creates an iterator for the array of Items.
     * @return WishListIterator increments through the array of items.
     */
    public WishListIterator createIterator() {
        WishListIterator itr = new WishListIterator(items);
        return itr;
    }

    /**
     * Method that returns the total cost of all the items in the array.
     * @return double Total cost of all items in array.
     */
    public double getTotalCost() {
        double price = 0;
        for (int i = 0; i < 5; i++) {
            price += items[i].getPrice();
        }

        return price;
    }

    /**
     * Method that takes in the previous array and doubles it in size and then moves all previous items to the new array.
     * @param items Smaller array that is half the size of the new array.
     * @return Item[] new array double the size of the old array.
     */
    private Item[] growArray(Item[] items) {
        Item narr[] = new Item[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            narr[i] = items[i];
        }
        return narr;

    }

}
