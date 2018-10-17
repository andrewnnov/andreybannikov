package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_04;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TaskG01_04Test {

    @Test
    public void when15RecurseThen987() {


        TaskG01_04 task = new TaskG01_04();

        String[] array = {"aza","zaza", "baza", "kaza", "prokaza", "sutki_bez_zakaza"};
        System.out.println("Входящий массив" + Arrays.toString(array));
        String[] sortArray = {"aza", "baza", "kaza", "prokaza", "sutki_bez_zakaza", "zaza"};

        assertEquals(Arrays.toString(sortArray), Arrays.toString(task.bubbleSort(array)));

        System.out.println("Упорядоченный" + Arrays.toString(task.bubbleSort(array)));
    }
}
