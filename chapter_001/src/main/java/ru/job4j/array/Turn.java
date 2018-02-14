package ru.job4j.array;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * invert array
     * @param array
     * @return invert array
     */
    public int[] back(int[] array){

        for(int i = 0; i < array.length/2; i++){
            int a = 0;
            a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
        return array;
    }
}
