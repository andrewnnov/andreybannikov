package ru.wayToHashMap;

import javax.xml.crypto.Data;

public class HashTable {

    private DataItem[] hashArray;  //массив ячеек хэш таблицы
    private int arraySize;


    public HashTable(int size) {  //конуструктор
        arraySize = size;
        hashArray = new DataItem[arraySize];
       // nonItem = new DataItem(-1);   //ключ удаленного элемента
    }


    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if(hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            }else {
                System.out.print("**");
            }
            System.out.println("");
        }
    }


    public int hashFunc(int key) {
        return key % arraySize;                 //хэш функция
    }

    public void insert(DataItem item) { //метод предполагает, что таблица не заполнена

        int key = item.getKey();  //получение ключа
        int hashVal = hashFunc(key); // хэширование ключа

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;        //переход к следующей ячейке
            hashVal %= arraySize;  //при достижении конца таблицы происходит возврат к началу
             //вставка элемента
        }
        hashArray[hashVal] = item;

    }

    //-------------------------------------------------------------------------------------------------


    public DataItem delete(int key) { //Удаление элемента данных
        int hashVal = hashFunc(key); //хэширование ключа

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal]; //временное сохранение
                hashArray[hashVal] = new DataItem(-1);   //удаление элемента
                return temp;  // метод возвращает удаленный элемент
            }
            ++hashVal;  //переход к следующей ячейке
            hashVal %=arraySize;  //при достижении конца таблицы переход к началу
        }
        return null; // элемент не найден
    }

    //---------------------------------------------------------------------------------------------------------

    public DataItem find(int key) { //поиск элемента с заданным ключом
        //метод предполагает, что таблица не заполнена

        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null; //элемент не найден
    }

    //----------------------------------------------------------------------------------------------------------












}
