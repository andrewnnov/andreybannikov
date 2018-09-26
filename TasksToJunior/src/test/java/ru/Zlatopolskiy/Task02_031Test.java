package ru.Zlatopolskiy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task02_031Test {

    @Test
    public void whenEnter235ThenTake253() {

        Task02_031 task02_031 = new Task02_031();

        int result = task02_031.changeNumber(235);

        assertEquals(253, result);
    }
}
