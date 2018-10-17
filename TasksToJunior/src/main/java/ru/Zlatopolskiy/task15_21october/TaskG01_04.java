package ru.Zlatopolskiy.task15_21october;


/*
Your program should take several String values from keyboard and print them in sorted order.
All the values should be placed into Comparable[] array. You are expected to implement two solutions here: bubble sorting algorithm, and selection sorting algorithm.

Sample input: aza zaza baza kaza prokaza sutki_bez_zakaza
Sample output: aza baza kaza prokaza sutki_bez_zakaza zaza

 */

public class TaskG01_04   {


    public Comparable[] bubbleSort(Comparable[] array) {

        for (int boarder = array.length - 1; boarder >=0 ; boarder--) {
            for (int index = 0; index < array.length -1; index++) {
                if(array[index].compareTo(array[index + 1]) > 0) {
                    Comparable tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }

        }


        return array;

    }


}
