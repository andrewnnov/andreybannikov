package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG1_07;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TaskG01_07Test {

    @Test
    public void whenWeHave2sortArrThenReturn1sort() {
        TaskG1_07 task = new TaskG1_07();
        Integer[] array1 = {1, 2, 4, 6, 8};
        Integer[] array2 = {3, 5, 7, 15, 20};
        Integer[] resArr = {1, 2, 3, 4, 5, 6, 7, 8, 15, 20};


        assertThat(task.mergeSortedArrays(array1, array2), is(resArr) );
    }

    @Test
    public void whenWeHave2EmptyArrThenReturn1sort() {
        TaskG1_07 task = new TaskG1_07();
        Integer[] array1 = {};
        Integer[] array2 = {};
        Integer[] resArr = {};


        assertThat(task.mergeSortedArrays(array1, array2), is(resArr) );
    }


}
