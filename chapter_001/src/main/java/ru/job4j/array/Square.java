package ru.job4j.array;
/**
 * @author andrewbannikov (andrewnnov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * array filling
     * @param bound (bound>=1)
     * @return full array
     */
    public int[] calculate(int bound){
        int [] rsl = new int [bound];
        for (int i = 1; i <= bound; i++){
            rsl [i - 1] = i*i;
        }
        return rsl;
    }
}
