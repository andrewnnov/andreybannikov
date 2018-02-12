package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {

    @Test

    public void WhenFirstMoreSecond(){
        Max maximum = new Max();
        int result = maximum.maxOfThreeNumber(1,-1, 0);
        assertThat(result, is(1));
    }


}
