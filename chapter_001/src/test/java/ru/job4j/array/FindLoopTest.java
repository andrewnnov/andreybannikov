package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {

    @Test
    public void whenThreeThenOne(){
        FindLoop findLoop = new FindLoop();
        int [] data = {1, 3, 5, 0, 7};
        int resultFind = findLoop.indexOf(data, 3);
        assertThat(resultFind, is(1));
    }

    @Test
    public void whenFourThenMinusOne(){
        FindLoop findLoop = new FindLoop();
        int [] data = {1, 3, 5, 0, 7, 3, 8};
        int resultFind = findLoop.indexOf(data, 4);
        assertThat(resultFind, is(-1));
    }






}
