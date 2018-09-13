package ru.job4j.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {

    public Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * add new Item
     * @param item - new Item
     * @return item
     */

    //0//////////////////////////////////////////////////////
    public Item addNewItem(Item item) {
        //generate ID number
        item.setIdOfItem(this.generateId());
        this.items[position++] = item;
        return item;
    }
    //////////////////////////////////////////////////////////
    /**
     * find item be ID(String)
     * @param id
     * @return item.get(id) = id
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item: items) {
            if(item != null && item.getIdOfItem().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    //////////////////////////////////////////////////////////////

    /**
     * generate random number of item
     * @return random number
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    //////////////////////////////////////////////////////////////////
    /**
     * Method get all Items
     * @return all Items
     */
    public Item[] getAllItems() {
        Item[] result  = new Item[this.position];
        for(int index = 0; index != position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
    ////////////////////////////////////////////////////////////////////

//    private List<Item> listOfItems = new ArrayList<>();
//
//    public Item addNewItem(Item item){
//         listOfItems.get(position++)= item;
//
//    }


}
