package ru.job4j.max;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /**
     * two numbers
     */
   public int first;
   public int second;

    /**
     * maximum of two number
     * @param  first number, second number
     * @return maximum
     */
   public int maxOfTwoNumber(int first, int second){

       return first > second ? first : second;
   }

}
