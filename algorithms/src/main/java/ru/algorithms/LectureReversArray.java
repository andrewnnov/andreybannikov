package ru.algorithms;

import java.util.Arrays;

public class LectureReversArray {


    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(invert(array)));
        System.out.println(Arrays.toString(invertRec(array, 0)));
    }

    /*
    revers array iterrativly
     */

    public static int[] invert(int[] data) {
        for (int k = 0; k < data.length/2; k++) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
        return data;
    }

    /*
    revers array rec
         */

    public static int[] invertRec(int[] data, int k) {
        if(k < data.length/2) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRec(data, k + 1);
        }
        return data;
    }


}
