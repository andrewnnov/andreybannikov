package ru.wayToHashMap;

import javax.xml.crypto.Data;

public class HashTable {

    private DataItem[] hashArray; //массив ячеек хэш таблицы
    private int arraySize;
    private DataItem nonItem;



    public HashTable(int size) { //конструктор
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); //ключ удаленного элемента
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < arraySize ; j++) {

            if(hashArray[j] != null) {
                System.out.println(hashArray[j].getKey() + " ");
            }else {
                System.out.println("** ");
            }
            System.out.println("");
        }
    }

    public int hashFunc(int key) {    //хэш функция
        return key % arraySize;
    }


    //------------------------------------------------------------------------------------------------------------------
    public void insert(DataItem item) { //вставка элмента данных. Метод предполагает, что таблица не заполнена
        int key = item.getKey(); //получение ключа
        int hashVal = hashFunc(key); // Хэшеирование ключа

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            //пока не будет найдена пустая ячейка или -1
            ++hashVal;             //переход к следущей ячейке. При достижени конца таблицы происходит переход к началу
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item; //вставка элемента
    }

    //------------------------------------------------------------------------------------------------------------------

    public DataItem delete(int key) { //удаление элемента данных
        int hashVal = hashFunc(key); //хэширование ключа

        while (hashArray[hashVal] != null) { //пока не будет найдена пустая ячейка/ Ключ найден?
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal]; //временное сохраниение
                hashArray[hashVal] = nonItem; //удаление элемента
                return temp; //метод возвращает элемент
            }
            ++hashVal;          //переход к следующей ячейке
            hashVal %= arraySize; // при достижении конца таблицы происходит возврат к началу
        }
        return null; //элемент не найден
    }

    //------------------------------------------------------------------------------------------------------------------

    public DataItem find(int key) {  // поиск элемента с заданным ключом

        int hashVal = hashFunc(key); //хэширование ключа

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal]; //Да, вернуть элемент.
            }
            ++hashVal;
            hashVal %=arraySize;

        }
        return null; // элемент не найден
    }
}
