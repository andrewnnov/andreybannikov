package ru.job4j.foreach1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class massiv {

    static int count = 0;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        int [] array = new int[list.size()];

        for (Integer el: list) {

            array[count] = el;
            count++;
        }
        System.out.println(Arrays.toString(array));




    }
}
