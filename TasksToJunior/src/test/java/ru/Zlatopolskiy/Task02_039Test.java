package ru.Zlatopolskiy;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Task02_039Test {

    @Test
    public void when2H30MThen75() {
        Task02_039 task = new Task02_039();

        double result = task.angleWatch(17, 30, 0);
        double expected = 75;

        assertThat(result, is(expected));
    }

    @Test
    public void when2H14M34SThen85() {
        Task02_039 task = new Task02_039();

        double result = task.angleWatch(2, 14, 34);
        double expected = 75;

        assertThat(result, is(expected));
    }



}
