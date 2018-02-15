package ru.job4j.array;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * sort an array in ascending order
     * @param array
     * @return sort an array
     */
    public int[] sort(int[] array){
        for(int i = array.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
