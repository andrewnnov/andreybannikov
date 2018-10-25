package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Before;
import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_04;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TaskG01_04Test {
    @Test
    public void whenAZABubleSortThenAtoZ() {
        TaskG01_04 task = new TaskG01_04();
        String[] array = {"aza","zaza", "baza", "kaza", "prokaza", "sutki_bez_zakaza"};
        System.out.println("Входящий массив" + Arrays.toString(array));
        String[] sortArray = {"aza", "baza", "kaza", "prokaza", "sutki_bez_zakaza", "zaza"};

        assertEquals(Arrays.toString(sortArray), Arrays.toString(task.bubbleSort(array)));

        System.out.println("Упорядоченный" + Arrays.toString(task.bubbleSort(array)));
    }


    @Test
    public void whenAZASelectSortThenAtoZ() {

        TaskG01_04 task = new TaskG01_04();
        String[] array = {"aza","zaza", "baza", "kaza", "prokaza", "sutki_bez_zakaza"};
        System.out.println("Входящий массив" + Arrays.toString(array));
        String[] sortArray = {"aza", "baza", "kaza", "prokaza", "sutki_bez_zakaza", "zaza"};

        assertEquals(Arrays.toString(sortArray), Arrays.toString(task.selectSort(array)));

        System.out.println("Упорядоченный" + Arrays.toString(task.selectSort(array)));
    }

    @Test
    public void whenIntSelectSortThen123() {

        TaskG01_04 task = new TaskG01_04();
        Integer[] array = {2, 4, 7, 3, 3, 1};
        System.out.println("Входящий массив" + Arrays.toString(array));
        Integer[] sortArray = {1, 2, 3, 3, 4, 7};

        assertEquals(Arrays.toString(sortArray), Arrays.toString(task.selectSort(array)));

        System.out.println("Упорядоченный" + Arrays.toString(task.selectSort(array)));
    }

}
