package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task04_115Test {

    @Test
    public void when1986ThenRedTiger() {
        Task04_115 task = new Task04_115();

        String defineYear = task.getYearTotem(1986) + " " + task.getYearColor(1986);

        assertEquals("Тигр Красный", defineYear );

    }


}
