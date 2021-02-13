package IteratorDesignPattern;

import java.util.Iterator;

/**
 * Class that is an iterator for a WishList.
 * @author Seth Baugh
 */
public class WishListIterator implements Iterator {
    private Item[] items;
    private int position;

    /**
     * Constructor that takes in an array of items and starts the iterator out at position 0.
     * @param _items array of items.
     */
    public WishListIterator(Item[] _items) {
        items = _items;
        position = 0;
    }

    /**
     * Method that returns true if there is another item in the array and false if there isn't. 
     * @return boolean returns true or false depending on whether there is another item in the array.
     */
    public boolean hasNext() {

        if (items.length <= position)
            return false;
        if (items[position] != null) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * Method that returns the next item in the array.
     * @return Item next Item in the array.
     */
    public Item next() {
        if (items[position] != null) {
            position++;
            return items[position - 1];
        }

        else {
            position++;
            return null;
        }
    }

}
