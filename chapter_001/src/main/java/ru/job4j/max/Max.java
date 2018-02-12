package ru.job4j.max;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * maximum ot three number
     * @param first
     * @param second
     * @param third
     * @return maximum
     */
    public int maxOfThreeNumber(int first, int second, int third){
        return maxOfTwoNumber(first, maxOfTwoNumber(second, third));
    }
    /**
     * maximum of two number
     * @param  first number, second number
     * @return maximum
     */
   public int maxOfTwoNumber(int first, int second){
       return first > second ? first : second;
   }
}
