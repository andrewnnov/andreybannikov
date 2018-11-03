package ru.wayToLinkedList;

public class LinkList {

    private Link first; //ссылка на первый элемент списка

    public void LinkList() { //конструктор
        first = null; //спискок пока не содержит элементов
    }

    public boolean isEmpty() { //true если список пуст
        return (first == null);
    }

    //вставка элемента в начало списка

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd); //создание нового элемента
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }

    //deleteFirst
    public Link deleteFirst() { //удаление первого элемента предполагается что список не пуст
        Link tmp = first; // сохранение ссылки
        first = first.next; //удаление first--> ссылка на второй элемент
        return tmp; // метод возвращает ссылку на удаленный элемент

    }

    //displayList()

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // от начала списка
        while (current != null) { //перемещение до конца списка
            current.displayLink(); //вывод данных
            current = current.next; //переход к следющему элементу
        }
        System.out.println("");
    }

    public Link find(int key) { //поиск элемента с заданным ключом

        Link current = first; //начиная с first
        while (current.iData != key) { // пока совпадение не найдено
            if(current.next == null){ //если достигнул конец списка
                return null; //и совпадение не найдено
            } else { //если еще остались элеменыт
                current = current.next; //перейти к следующему
            }

        }
        return current;

    }

    public Link delete(int key) { //удаление элмента с заданым ключом
        Link current = first; // поисх элемента
        Link previous = first;

        while (current.iData != key) {
            if (current.next == null) {
                return null;            // элемент не найден
            } else {
                previous = current; // перейти к следующему элементу
                current = current.next;
            }
        }                      //совпадение не найдено
        if(current == first) { // если первый элемент
            first = first.next; //изменить first
        }else {                       // в противном случае
            previous.next = current.next; // обойти его в списке
        }
        return current;

    }


}
