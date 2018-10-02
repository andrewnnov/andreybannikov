package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task04_106Test {

    @Test
    public void wheReceive12ThenWinter() {
        Task04_106 task = new Task04_106();
        assertEquals("Winter", task.determinateOfSeasons(12));
    }

    @Test
    public void wheReceive17ThenError() {
        Task04_106 task = new Task04_106();
        assertEquals("Недопустимое значение", task.determinateOfSeasons(17));
    }


}
