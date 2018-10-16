package ru.Zlatopolskiy.task15_21october;

/*
Your program should take several int values from keyboard and print them in sorted order.
All the values should be placed into int[] array. You are expected to implement bubble sorting algorithm for this task.

Sample input: 1 9 8 1 7 6 5 3 4 5 2 5 6 0 0
Sample output: 0 0 1 1 2 3 4 5 5 6 6 7 8 9

 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskG01_03BubbleSort {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int lengthArray = scanner.nextInt();

        int [] newArray = new int[lengthArray];

        for (int i = 0; i < lengthArray ; i++) {
            System.out.println("Введите значение номер " + (i+1));
            newArray[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив " + Arrays.toString(newArray));

        TaskG01_03BubbleSort task = new TaskG01_03BubbleSort();
        System.out.println("Массив после сортировки " + Arrays.toString(task.bubbleSort(newArray)));
    }



    public int[] bubbleSort(int[] array) {

        for (int border = array.length -1; border >=0 ; border--) {
            for (int index = 0; index < border ; index++) {

                if(array[index] > array[index + 1]) {
                        int tmp = array[index];
                        array[index] = array[index+1];
                        array[index + 1] = tmp;
                }

            }
            
        }
        return array;
            
        }
    
}
