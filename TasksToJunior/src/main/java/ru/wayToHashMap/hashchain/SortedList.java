package ru.wayToHashMap.hashchain;

public class SortedList {

    private Link first;  //ссылка на первый элемент списка

    public void SortedList() {
        first = null;
    }

    public void insert(Link theLink) { //вставка в порядке сортировки

        int key = theLink.getKey();
        Link previous = null;  //начиная с первого элемента
        Link current = first;
        //до конца списка
        while (current !=null && key > current.getKey()) {
            previous = current;
            current = current.next; //переход к следующему элементу

            if(previous == null) {  //в начале списка
                first = theLink;    //first --> новый элемент
            } else {               //не в начале
                previous.next = theLink;  //prev--> новый элемент
            }

            theLink.next = current; //новый элемент --> current
        }
    }

    public void delete(int key) {
        Link previous = null;       //начиная с первого элемента
        Link current = first;

        while (current != null && key != current.getKey()) {
            previous = current;
            current = current.next; // переход к следующему элементу
                                   //Отсоединение
            if(previous == null) { //если первый элемент
                first = first.next; // изменить first
            } else {
                previous.next = current.next; //удалить текущий элемент
            }
        }
    }

    public Link find(int key) {
        Link current = first;

        while (current != null && current.getKey() <= key) {
            if(current.getKey() == key) {
                return current;  // совпадение обнаружено
            }
            current = current.next;  // переход к следующему элементу
        }
        return null;  //элемент не найден
    }

    public void displayList() {
        System.out.print("List(first-->last): ");
        Link current = first; //от начала списка
        while (current != null) {  //перемещение до конца списка
            current.displayLink();  //вывод данных
            current = current.next; // переход к следующему элементу
        }
        System.out.println("");
    }


}
