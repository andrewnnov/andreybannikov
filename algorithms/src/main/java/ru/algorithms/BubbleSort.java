package ru.algorithms;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {

        int[] array = {};
        int[] array1 = {2, 3, 7, 16, 1};

        sort(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 2; index >= barrier; barrier--) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }


}
