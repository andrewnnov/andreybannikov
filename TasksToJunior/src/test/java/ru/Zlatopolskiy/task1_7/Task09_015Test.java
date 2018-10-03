package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task09_015Test {

    @Test
    public void whenBookFound2ThenReturnK() {
        Task09_015 task = new Task09_015();
        assertEquals("k",task.identifyOfSymbol(3, "Book"));
        System.out.println(task.identifyOfSymbol(3, "Book"));
    }



}
