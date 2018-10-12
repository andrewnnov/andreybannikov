package ru.Zlatopolskiy.Task8_14october;
/*
Удалить из массива все повторяющиеся элементы, оставив их первые вхо-ждения, т. е. в массиве должны остаться только различные элементы.
 */

import java.util.Arrays;
import java.util.Set;

public class Task11_158 {


    public static void main(String[] args) {

        int[] array = {1, 3, 1, 1, 4, 3};
        System.out.println(deleteSameElementFromArray(array));
    }

    public static int[] deleteSameElementFromArray(int[] array) {

        int[] changeArray = array;

        for (int i = 0; i < changeArray.length ; i++) {


           if(changeArray[i] == changeArray[i+1]) {
               System.arraycopy(changeArray,  i+1, changeArray, i+1, changeArray.length - 1);
           }

        }

        return changeArray;
    }
}
