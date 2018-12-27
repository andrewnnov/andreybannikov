package ru.wayToHashMap;

public class DataItem {

    private int iData; //данных может быть и больше. Данные(ключ)
    private int nonItem;

    public int getNonItem() {
        return nonItem;
    }

    public DataItem(int ii) {
        iData = ii;
    }

    public int getKey() {
        return iData;
    }



}
