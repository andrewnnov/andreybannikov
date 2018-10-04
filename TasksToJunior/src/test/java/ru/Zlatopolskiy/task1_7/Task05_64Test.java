package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Task05_64Test {

    @Test
    public void whenBookFound2ThenReturnK() {

        double[] arr1 ={5, 10};
        int[] arr2 = {2, 2};

        //assertEquals(10, Task05_064.averageDensity(arr1, arr2));

        assertThat(Task05_064.averageDensity(arr1, arr2), is(3.75));

    }
}
