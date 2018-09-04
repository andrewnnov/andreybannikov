package ru.job4j.golovach1;


/*
Class show how to work method toString() in arrays
 */

import java.util.Arrays;

public class App00 {

    public static void main(String[] args) {

        int [] array1D = {1, 2, 3, 4};
        int [][] array2D = {{1,2},{3, 4}};

        System.out.println(array1D);
        System.out.println(array2D);
        System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.deepToString(array2D));

    }




}
