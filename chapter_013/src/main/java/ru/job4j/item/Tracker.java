package ru.job4j.item;

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
    public Item findById(String id) {
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

    /**
     * find element and replace it
     * @param id
     * @param item
     */

    public void replaceItem(String id, Item item){
        for (int index = 0; index != items.length; index++) {
            if (items[index].getIdOfItem() != null && items[index].getIdOfItem().equals(id)) {
                item.setIdOfItem(id);
                items[index] = item;
                break;
            }
        }
    }

    /**
     * find Item by name
     * @param key -
     * @return
     */
    public Item[] findItemByName(String key) {

        int newPosition = 0;
        //count of name = key
        int count = 0;
        Item[] resultItem = new Item[this.position];

         for (int i = 0; i < this.position; i++ ) {
             if (items!= null && items[i].getName().equals(key)) {
                 count++;
                 resultItem[newPosition++] = items[i];
             }
         }

         Item[] cutItem = new Item[count];
         System.arraycopy(resultItem, 0, cutItem, 0, count);
         return cutItem;
    }



    public void delete(String id){
        Item[] deleteItem = new Item[position - 1];
        //index when id equals id
        int findIndexOfId;
        for(int i =0; i < position; i++) {
            if (items[i] != null && items[i].getIdOfItem().equals(id)){
                findIndexOfId = i;
                System.arraycopy(items, findIndexOfId + 1, items, findIndexOfId, position - findIndexOfId);
                items[position - 1] = null;
                position--;
                break;
            }
        }

    }
}
