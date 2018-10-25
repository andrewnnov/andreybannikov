package ru.Zlatopolskiy.Task8_14october;

import java.util.Arrays;

public class Task12_63 {


    public static void main(String[] args) {
        Task12_63 task = new Task12_63();
        int[][] arr = { {20, 30, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
                        {20, 20, 20, 20},
        };

        System.out.print(Arrays.toString(task.defineAverNumber(arr)));
    }


    public int[] defineAverNumber(int[][] school) {

        int[] averNumber = new int[school.length];

        for (int parallel = 0; parallel < averNumber.length; parallel++) {

            int[] paral = school[parallel];
            averNumber[parallel] = calculateArraySumm(paral)/ paral.length;

        }
//        for (int i = 0; i < averNumber.length; i++) {
//            averNumber[i] = averNumber[i]/4;
//
//        }

        return averNumber;
    }

    public int calculateArraySumm(int[] ints) {
        int result = 0;

        for (int nameOfClass = 0; nameOfClass < ints.length ; nameOfClass++) {

           result += ints[nameOfClass];
        }
        return result;
    }
}
