package ru.wayToHashMap.hashchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashChainApp {

    public static void main(String[] args) throws IOException {

        int aKey;
        Link aDataItem;
        int size, n, keysPerCell = 100;

        //ввод размеров

        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.println("Enter initial number of items: ");
        n = getInt();

        //создание таблицы
        HashTable theHashTable = new HashTable(size);
        for (int j = 0; j < n ; j++) {
            aKey = (int)(java.lang.Math.random() * keysPerCell * size);
            aDataItem = new Link(aKey);
            theHashTable.insert(aDataItem);
        }

        //взаимодействие с пользователем

        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;

                case 'i':
                    System.out.println("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new Link(aKey);
                    theHashTable.insert(aDataItem);
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
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                        break;
                    }
                 default:
                     System.out.println("Invalid entry \n");
            }
        }

    }

    private static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    private static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


}
