package ru.algorithms;

import java.util.Arrays;

public class SelectSort {


    public static void main(String[] args) {
        int[] a1 = {2, 1, 3, 4};

        System.out.println(Arrays.toString(selectionSort(a1)));
    }

    public static int[] selectionSort (int[] numbers){
        int min, temp;

        for (int border = 0; border < numbers.length-1; border++){
            min = border;
            for (int index = border+1; index < numbers.length; index++){
                if (numbers[index] < numbers[min])
                    min = index;
            }

            // Swap the values
            temp = numbers[min];
            numbers[min] = numbers[border];
            numbers[border] = temp;
        }

        return numbers;
    }






}
