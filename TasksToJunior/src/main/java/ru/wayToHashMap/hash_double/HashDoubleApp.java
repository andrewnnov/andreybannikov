package ru.wayToHashMap.hash_double;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashDoubleApp {
    public static void main(String[] args) throws IOException {


        DataItemDH aDataItem;
        int aKey, size, n, keysPerCell;

        //ввод размеров

        System.out.println("Enter size of hash table:");
        size = getInt();
        System.out.println("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        //создание таблицы
        HashTableDH theHashTable = new HashTableDH(size);

        for (int j = 0; j < n ; j++) { //вставка данных
            aKey = (int)(java.lang.Math.random()* keysPerCell*size);
            aDataItem = new DataItemDH(aKey);
            theHashTable.insert(aKey, aDataItem);
        }

        while (true) { //взаимодействие с пользователем
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();

            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.println("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItemDH(aKey);
                    theHashTable.insert(aKey, aDataItem);
                    break;
                case 'd':
                    System.out.println("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.println("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if(aDataItem != null) {
                        System.out.println("Found" + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.println("Invalid entry\n");
            }
        }
    }


    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s= br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }


    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
