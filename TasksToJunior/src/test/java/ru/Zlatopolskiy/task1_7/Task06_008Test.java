package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task06_008Test {

    @Test
    public void when5ThenPrint1_4() {
        Task06_008 task = new Task06_008();
        task.sampleFromArray(5);
        assertEquals(2,  task.sampleFromArray(5).size());
        System.out.println(task.sampleFromArray(5));
    }
}
