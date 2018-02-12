package ru.job4j.loop;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * counter summ
     */
    public int count = 0;

    /**
     * Summ all of the even numbers
     * @param start
     * @param finish
     * @return summ
     */
    public int add(int start, int finish){
        for (int i = start; i <= finish; i++){
            if(i % 2 == 0){
                count = count + i;
            }
        }
        return count;
    }
}
