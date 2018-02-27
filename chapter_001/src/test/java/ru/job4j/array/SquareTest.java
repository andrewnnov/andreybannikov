package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {

    @Test
    public void whenBoundThreeThenOneFourNine(){
        Square square = new Square();
        int[] resultArray = square.calculate(3);
        int[] expectArray = {1, 4, 9};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenBoundFiveThenOneFourNineSixteenTwFive(){
        Square square = new Square();
        int[] resultArray = square.calculate(5);
        int[] expectArray = {1, 4, 9, 16, 25};
        assertThat(resultArray, is(expectArray));
    }
}
