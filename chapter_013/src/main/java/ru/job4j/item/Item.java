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
}
