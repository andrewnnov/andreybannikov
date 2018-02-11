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
        int result = maximum.maxOfTwoNumber(1,2);
        assertThat(result, is(2));
    }


}
