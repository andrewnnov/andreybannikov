package ru.Zlatopolskiy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task04_15Test {

    @Test
    public void when198112Then36() {

        Task04_15 task = new Task04_15();

        int result = task.returnAgeOfMan(12, 1981);

        assertEquals(36, result);
    }

    @Test
    public void when198109Then37() {

        Task04_15 task = new Task04_15();

        int result = task.returnAgeOfMan(9, 1981);

        assertEquals(37, result);
    }

    @Test
    public void when198108Then37() {

        Task04_15 task = new Task04_15();

        int result = task.returnAgeOfMan(8, 1981);

        assertEquals(37, result);
    }


}
