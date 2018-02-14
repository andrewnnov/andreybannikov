package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class TurnTest {
    @Test
    public void whenTransmitArrayEvenThenReturnArrayBack(){
        Turn turn = new Turn();
        int [] array = {1, 2, 3, 4};
        int[] resultArray = turn.back(array);
        int[] expectArray = {4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenTransmitArrayNotEvenThenReturnArrayBack(){
        Turn turn = new Turn();
        int [] array = {1, 2, 3, 4, 5};
        int[] resultArray = turn.back(array);
        int[] expectArray = {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}
