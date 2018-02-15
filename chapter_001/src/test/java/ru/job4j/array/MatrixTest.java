package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
    public class MatrixTest {
    @Test
    public void whenTableNineToNine() {
        Matrix matrix = new Matrix();
        int[][] resultArray = matrix.multiple(4);
        int[][] arrayExcepted = {
                {1   ,2   ,3   ,4   },
                {2   ,4   ,6   ,8   },
                {3   ,6   ,9   ,12  },
                {4   ,8   ,12  ,16  },
         };
        assertThat(resultArray, is(arrayExcepted));

    }
}




