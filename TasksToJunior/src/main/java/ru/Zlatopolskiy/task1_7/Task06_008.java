package ru.Zlatopolskiy.task1_7;
/*
Дано число n. Из чисел 1, 4, 9, 16, 25, ... напечатать те, которые не превыша-
ют n.
 */

import java.util.ArrayList;
import java.util.List;

public class Task06_008 {

    public List<Integer> sampleFromArray(int n) {

        int [] arrayOfNumbers = {1, 4, 9, 16, 25, 41};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrayOfNumbers.length ; i++) {
            if(arrayOfNumbers[i] < n) {
                list.add(arrayOfNumbers[i]);
            }
        }

        return list;


    }
}
