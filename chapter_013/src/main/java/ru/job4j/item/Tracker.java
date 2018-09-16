package ru.job4j.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {

    List<Item> items = new ArrayList<>();
    private static final Random RN = new Random();


    public Item addNewItem(Item item) {

        item.setIdOfItem(this.generateId());
        items.add(item);
        return item;
    }

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


    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    public List<Item> getAllItems() {
        List<Item> result  = new ArrayList<>();
        for(int index = 0; index != items.size(); index++) {
           result.add(items.get(index));
        }
        return result;
    }

    public void replaceItem(String id, Item item){
        for (int index = 0; index != items.size(); index++) {
            if (items.get(index).getIdOfItem() != null && items.get(index).getIdOfItem().equals(id)) {
                item.setIdOfItem(id);

                items.set(index, item);
                break;
            }
        }
    }

    public List<Item> findItemByName(String key) {

        List<Item> resultItem = new ArrayList<>();
         for (int i = 0; i < items.size(); i++ ) {
             if (items!= null && items.get(i).getName().equals(key)) {
                 resultItem.add(items.get(i));
             }
         }
         return resultItem;
    }

    public void delete(String id){
        for(int i =0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i).getIdOfItem().equals(id)){
                items.remove(i);
                break;
            }
        }

    }
}
