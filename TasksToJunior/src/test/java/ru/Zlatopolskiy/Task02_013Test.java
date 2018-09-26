package ru.Zlatopolskiy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task02_013Test {

    @Test
    public void when123then321() {
        Task02_013 task = new Task02_013();
        assertEquals(321, task.reversNumber(123));
    }
}
