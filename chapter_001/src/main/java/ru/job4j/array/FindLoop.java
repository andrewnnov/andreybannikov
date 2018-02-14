package ru.job4j.array;

/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * Find element in array and return index of array
     * @param data array
     * @param el element
     * @return index element or -1 when not element
     */
    public int indexOf(int[] data, int el){
        int rsl = -1;
        for(int i = 0; i < data.length; i++ ){
            if(data[i] == el){
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
