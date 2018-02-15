package ru.job4j.array;

import java.util.Arrays;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * remove duplicates
     * @param array
     * @return array without duplicates
     */
    public String[] remove(String[] array){
        int unique = array.length;
        for( int out = 0; out < unique; out++){
           for(int in = out + 1; in < unique; in++){
               if(array[out].equals(array[in])){
                   String temp = array[in];
                   array[in] = array[unique - 1];
                   array[unique - 1] = temp;
                   unique--;
                   in--;
               }
           }
        }
        return Arrays.copyOf(array, unique);

    }
}
