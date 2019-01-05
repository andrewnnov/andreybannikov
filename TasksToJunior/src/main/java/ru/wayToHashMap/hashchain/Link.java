package ru.wayToHashMap.hashchain;

/*
реализация хэш таблицы с использованием метода цепочек
 */

public class Link {

    private int iData;
    public Link next; //следующий элемент списка

    public Link(int it) {
        iData = it;
    }

    public int getKey() {
        return iData;
    }

    public void displayLink() {
        System.out.println(iData + " ");
    }
}
