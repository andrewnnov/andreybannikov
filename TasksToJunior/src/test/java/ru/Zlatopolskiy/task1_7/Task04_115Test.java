package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task04_115Test {

    @Test
    public void when1986ThenRedTiger() {
        Task04_115 task = new Task04_115();
        assertEquals("Тигр Красный", task.definitionChineseYear(1986));
        System.out.println(task.definitionChineseYear(1986));
    }


}
