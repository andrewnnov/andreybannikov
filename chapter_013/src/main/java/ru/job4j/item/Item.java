package ru.job4j.item;

public class Item {

    private String idOfItem;

    private String name;

    private String description;

    private long create;

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getCreate() {
        return create;
    }

    public String getIdOfItem() {
        return idOfItem;
    }

    public void setIdOfItem(String idOfItem) {
        this.idOfItem = idOfItem;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
