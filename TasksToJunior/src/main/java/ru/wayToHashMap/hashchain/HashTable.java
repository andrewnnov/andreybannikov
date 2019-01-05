package ru.wayToHashMap.hashchain;

public class HashTable {

    private SortedList[] hashArray; // массив списков
    private int arraySize;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new SortedList[arraySize]; //создание массива
        for (int j = 0; j < arraySize; j++) { //заполнение массива
            hashArray[j] = new SortedList();  //списками
        }
    }

    public void displayTable() {
        for (int j = 0; j < arraySize; j++) { //для каждой ячейки
            System.out.print(j+ ". "); //вывод номера ячейки
            hashArray[j].displayList(); //вывод списка
        }
    }

    public int hashFunc(int key) { //хэш функция
        return key % arraySize;
    }

    public void insert(Link theLink) { //вставка элемента
        int key = theLink.getKey();
        int hashVal = hashFunc(key);  // хэширование ключа
        hashArray[hashVal].insert(theLink); //вставка в позиции hashVal
    }

    public void delete(int key) { //удаление элемента
        int hashVal = hashFunc(key); //хэширование ключа

        hashArray[hashVal].delete(key);
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
}
