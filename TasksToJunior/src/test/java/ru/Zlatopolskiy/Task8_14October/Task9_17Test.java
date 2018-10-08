package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Task9_17;


import static org.junit.Assert.assertEquals;

public class Task9_17Test {

    @Test
    public void whenWOWthenTrue() {
        Task9_17 task = new Task9_17();
        assertEquals(true, task.sameLetter("wow"));
    }

    @Test
    public void whenWOthenFalse() {
        Task9_17 task = new Task9_17();
        assertEquals(false, task.sameLetter("wo"));
    }


}
