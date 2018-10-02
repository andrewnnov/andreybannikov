package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task04_36Test {

    @Test
    public void wheReceive2ThenGreen() {
        Task04_036 task = new Task04_036();
        assertEquals("Green", task.determinationOfColor(2));
    }

    @Test
    public void wheReceive4ThenRed() {
        Task04_036 task = new Task04_036();
        assertEquals("Red", task.determinationOfColor(4));
    }

    @Test
    public void wheReceive0ThenGreen() {
        Task04_036 task = new Task04_036();
        assertEquals("Green", task.determinationOfColor(0));
    }

    @Test
    public void wheReceive60ThenGreen() {
        Task04_036 task = new Task04_036();
        assertEquals("Green", task.determinationOfColor(60));
    }


}
