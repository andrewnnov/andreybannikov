package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Task12_63;
import ru.Zlatopolskiy.Task8_14october.Task9_42;

import static org.junit.Assert.assertEquals;

public class Task12_63Test {

    @Test
    public void whenPushArrThenReceivAverNumber() {
        Task12_63 task = new Task12_63();
        int[][] arr = { {20, 30, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {30, 50, 20, 30},
        };


        assertEquals(22, task.defineAverNumber(arr)[0]);
        assertEquals(32, task.defineAverNumber(arr)[10]);
    }
}
