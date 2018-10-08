package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Task9_17;
import ru.Zlatopolskiy.Task8_14october.Task9_22;

import static org.junit.Assert.assertEquals;

public class Task9_22Test {

    @Test
    public void whenPassWordThenReturnFirstHalfWord() {
        Task9_22 task = new Task9_22();
        assertEquals("ret", task.printFirstHalfWord("return"));
    }


}
