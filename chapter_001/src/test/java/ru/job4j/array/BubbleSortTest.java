package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    @Test
    public void whenThreeOneTwoThenOneTwoThree(){
        BubbleSort bubbleSort = new BubbleSort();
        int [] array = {3, 1, 2};
        int[] resultArray = bubbleSort.sort(array);
        int[] expectArray = {1, 2, 3};
        assertThat(resultArray, is(expectArray));
    }
}
