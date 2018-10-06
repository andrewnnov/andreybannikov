package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task04_067Test {

    @Test
    public void wheDay300ThenWeekEnd() {
        Task04_067 task = new Task04_067();
        assertEquals("Выходной", task.definitionDayOfWeek(300));
    }

    @Test
    public void wheDay0ThenWeekEnd() {
        Task04_067 task = new Task04_067();
        assertEquals("Выходной", task.definitionDayOfWeek(0));
    }


}
