package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Task9_102;
import ru.Zlatopolskiy.Task8_14october.Task9_17;

import static org.junit.Assert.assertEquals;

public class Task9_102Test {

    @Test
    public void whenCatThenTac() {
        Task9_102 task = new Task9_102();
        assertEquals("taC", task.reversLetterInTheWord("Cat", 1, 3));
    }
}
