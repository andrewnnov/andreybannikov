package ru.job4j.tracker;

import ru.job4j.item.Item;

import java.util.Random;

public class Tracker {

    private Item[] items = new Item[100];

    private int position = 0;
    private static Random RN = new Random();

    public void setItems(Item[] items) {
        this.items = items;
    }

    /**
     * Add the new item
     * @param item
     * @return item
     */
    public Item add(Item item){
        item.setId(this.generatedId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Edit item
     * @param id
     * @param item
     */
    public void replace(String id, Item item){
        for(int index = 0; index < items.length; index++){
            if(items[index].getId() != null && items[index].getId().equals(id)){
                items[index] = item;
                break;
            }
        }
    }
    /**
     * Delete item
     * @param id
     */
    public void delete(String id){

        Item [] itemDelete = new Item [this.position];
        for(int index = 0; index < position; index++){
            if(items[index].getId() != null && items[index].getId().equals(id) ){
                System.arraycopy(items, index +1, items, index, position - index);
                items[position - 1] = null;
                position--;
            }
        }
    }
    /**
     * Getting a list all items
     * @return
     */
    public Item[] findAll(){
        Item [] result = new Item[this.position];
        for(int index = 0; index < this.position; index++){
            result[index] = this.items[index];
        }
        return result;
    }
    /**
     * Getting list for name
     * @param key
     * @return
     */
    public Item[] findByName(String key){
        Item [] result = new Item[this.position];
        int newPosition = 0;
        for(int index = 0; index < position; index++){
            if(items[index] != null && items[index].getName().equals(key)){
                result[newPosition++] = this.items[index];
            }
        }
        return result;
    }
    /**
     * Getting item for id
     * @param id
     * @return
     */
    public Item findById(String id){
        Item result = null;
        for(Item item : items){
            if(item != null && item.getId().equals(id)){
                result = item;
                break;
            }
        }
        return result;
    }

    private String generatedId(){

        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

}
