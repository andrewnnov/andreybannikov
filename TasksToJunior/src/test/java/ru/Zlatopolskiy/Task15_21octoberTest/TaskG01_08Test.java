package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_08;


import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TaskG01_08Test {

    @Test
    public void whenWeHave2UnSortArrayThenReturnSortArray() {

        TaskG01_08 task = new TaskG01_08();

        Integer[] notSortedArray = {17, 34, 2, 4, 67, 89, 1, 0, 13, 5};
        Integer[] sortedArray = {0, 1, 2, 4, 5, 13, 17, 34, 67, 89};





       assertThat(task.mergeSortRec(notSortedArray, 0, 9), is(sortedArray) );
    }


    @Test
    public void whenWeHave2UnSortArrayStringThenReturnSortArrayString() {

        TaskG01_08 task = new TaskG01_08();

        String[] notSortedArray = {"maza", "faza", "sister", "braza"};
        String[] sortedArray = {"braza", "faza", "maza", "sister"};





        assertThat(task.mergeSortRec(notSortedArray, 0, 3), is(sortedArray) );

        System.out.println(Arrays.toString(task.mergeSortRec(notSortedArray, 0, 3)));
    }

    @Test
    public void whenWeHave2UnSortArrayStringThenReturnSortArrayStringIterMethod() {

        TaskG01_08 task = new TaskG01_08();

        String[] notSortedArray = {"maza", "faza", "sister", "braza"};
        String[] sortedArray = {"braza", "faza", "maza", "sister"};



        assertThat(task.mergeSortIter(notSortedArray, 0, 3), is(sortedArray) );

        System.out.println(Arrays.toString(task.mergeSortIter(notSortedArray, 0, 3)));
    }
}
