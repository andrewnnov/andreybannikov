package ru.wayToLinkedList;

public class Link {

    public int iData; //данные
    public double dData; // данные
    public Link next; //следующий элемент в списке


    public Link(int id, double dd) { // конструкто
        iData = id; // инициализация данных (next автоматичеки присваивается null
        dData = dd;
    }

    public void displayLink() { //вывод содержимого элемента
        System.out.print("{" + iData + ". " + dData + "} ");
    }
}
