package ru.Zlatopolskiy.Task15_21octoberTest;


import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_02_fibonacci;
import ru.Zlatopolskiy.task15_21october.TaskG01_03BubbleSort;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TaskG01_03BubbleSortTest {


    @Test
    public void when15RecurseThen987() {


        TaskG01_03BubbleSort task = new TaskG01_03BubbleSort();

        int[] array = {5, 3, 1, 6};
        System.out.println("Входящий массив" + Arrays.toString(array));
        int[] sortArray = {1, 3, 5, 6};



        assertEquals(Arrays.toString(sortArray), Arrays.toString(task.bubbleSort(array)));

        System.out.println("Упорядоченный" + Arrays.toString(task.bubbleSort(array)));
    }

}
