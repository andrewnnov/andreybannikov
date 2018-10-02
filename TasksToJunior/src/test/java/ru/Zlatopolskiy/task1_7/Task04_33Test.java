package ru.Zlatopolskiy.task1_7;

import org.junit.Test;
import ru.Zlatopolskiy.Task02_013;

import static org.junit.Assert.assertEquals;

public class Task04_33Test {

    @Test
    public void wheEvenNumberThenYes() {
        Task04_033 task = new Task04_033();
        assertEquals("Число заканчивается четной цифрой", task.determinationOfLastNumber(12));
    }

    @Test
    public void whenOddNumberThenNo() {
        Task04_033 task = new Task04_033();
        assertEquals("Число заканчивается нечетной цифрой", task.determinationOfLastNumber(11));
    }
}
