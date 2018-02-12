package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {

    @Test
    public void whenSumEvenNumbersOneToTenThenThirty(){

        Counter counter = new Counter();
        int result = counter.add(1,10);
        assertThat(result, is(30));


    }



}
