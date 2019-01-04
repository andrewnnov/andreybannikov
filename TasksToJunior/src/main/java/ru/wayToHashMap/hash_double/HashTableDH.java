package ru.wayToHashMap.hash_double;

public class HashTableDH {

    private DataItemDH[] hashArray; //массив ячеек хэш таблицы
    private int arraySize;
    private DataItemDH nonItem;  //для удаленных элементов

    //конструктор---------------------------------------------

    public HashTableDH(int size) {
        arraySize = size;
        hashArray = new DataItemDH[arraySize];
        nonItem = new DataItemDH(-1);
    }

    //вывод на экран--------------------------------------------

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize ; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            }else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }

    //1я хэш функция
    public int hashFunc1(int key) {
        return key % arraySize;
    }

    //2я хэш функция
    public int hashFunc2(int key) {
        //возращаемое значение отлично от нуля,
        //меньше размера массива
        //функция отлична от ХФ1
        //размер массива должен быть простым по отношению к 5, 4, 3, 2,

        return 5 - key % 5;
    }

    //вставка элемента данных -------------------------------------------------------------------------
    public void insert(int key, DataItemDH itemDH) {
        //метод предполагает, что таблица не заполнена
        int hashVal = hashFunc1(key); //хэширование ключа
        int stepSize = hashFunc2(key); // вычисление смещения

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            hashVal += stepSize; //прибавление смещения
            hashVal %= arraySize; //возврат к началу
        }

        hashArray[hashVal] = itemDH; //вставка элемента
    }

    //удаление элемента данных

    public DataItemDH delete(int key) {

        int hashVal = hashFunc1(key); //хэширование ключа
        int stepSize = hashFunc2(key); // вычисление смещения

        while (hashArray[hashVal] != null) {

            if(hashArray[hashVal].getKey() == key) {
                DataItemDH temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }

            hashVal += stepSize; //прибавление смещения
            hashVal %= arraySize; //возрват к началу
        }
        return null;
    }

    //Поиск элемента с заданным ключем

    public DataItemDH find(int key) {
        //метод предполагает, что таблица не заполнена
        int hashVal = hashFunc1(key); //хэширование ключа
        int stepSize = hashFunc2(key); // вычисление смещения

        while (hashArray[hashVal] != null) { //пока не найдена пустая ячейка
            if(hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            hashVal += stepSize; //прибавление смещения
            hashVal %= arraySize; //возрват к началу

        }
        return null;
    }

}
