package ru.wayToLinkedList;

public class LinkedListApp {

    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);


        theList.displayList(); // вывод содержимого

        while (!theList.isEmpty()) { //пока остаются элементы
            Link aLink = theList.deleteFirst(); //удаление элемента
            System.out.print("Deleted.."); //вывод удаленного элемента
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList(); //вывод содержимого списка

        LinkList theList1 = new LinkList(); // Создание нового списка
        theList1.insertFirst(22, 2.99); // Вставка 4 элементов
        theList1.insertFirst(44, 4.99);
        theList1.insertFirst(66, 6.99);
        theList1.insertFirst(88, 8.99);
        theList1.displayList(); // Вывод содержимого списка

        Link f = theList1.find(44); // Поиск элемента
        if( f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can’t find link");


        Link d = theList1.delete(66); // Удаление элемента
        if( d != null )
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can’t delete link");
        theList.displayList(); // Вывод содержимого списка
    }


}
