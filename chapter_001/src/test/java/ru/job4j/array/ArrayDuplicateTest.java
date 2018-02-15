package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String [] arrayInput = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String [] result = arrayDuplicate.remove(arrayInput);
        String [] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expect));

    }
}
