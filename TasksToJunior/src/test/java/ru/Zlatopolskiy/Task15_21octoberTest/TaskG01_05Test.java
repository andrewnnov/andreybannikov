package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_05;

import static org.junit.Assert.assertEquals;

public class TaskG01_05Test {

    @Test
    public void whenBazaBinarySearchThenPrint1() {
        TaskG01_05 task = new TaskG01_05();
        String[] array = {"aza", "baza", "kaza", "prokaza", "sutki_bez_zakaza"};

        assertEquals(1, task.binarySearch(array, "baza"));
    }

    @Test
    public void when4BinarySearchThen2() {
        TaskG01_05 task = new TaskG01_05();
        Integer[] array = {1, 2, 4, 7, 16};

        assertEquals(2, task.binarySearch(array, 4));
    }




}
