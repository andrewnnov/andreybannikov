package ru.Zlatopolskiy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task01_003Test {

    @Test
    public void whenWeEnter100ThenWePrint100() {

        Task01_003 number = new Task01_003();




        assertEquals(number.enterNumberFromKeyBoard(), 100);

    }
}
