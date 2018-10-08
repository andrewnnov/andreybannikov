package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Task9_17;
import ru.Zlatopolskiy.Task8_14october.Task9_42;

import static org.junit.Assert.assertEquals;

public class Task09_42Test {

    @Test
    public void whenDimaThenamiD() {
        Task9_42 task = new Task9_42();
        assertEquals("amid", task.invertAndPrintWord("dima"));
    }

    @Test
    public void whenNothingThenNothing() {
        Task9_42 task = new Task9_42();
        assertEquals("", task.invertAndPrintWord(""));
    }

    @Test
    public void whenDimanThenNamiD() {
        Task9_42 task = new Task9_42();
        assertEquals("namid", task.invertAndPrintWordStringBuilder("diman"));
    }


}
