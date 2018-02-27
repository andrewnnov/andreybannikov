package ru.job4j.part1_test;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class WordInWord {
    /**
     * find word in other word
     * @param origin word we are looking for
     * @param sub word that is looking for
     * @return true or false
     */
    boolean contains(String origin, String sub){
        /**
         * array consist origin
         */
        char[] originArray = origin.toCharArray();
        /**
         * array sub
         */
        char[] subArray = sub.toCharArray();

        boolean result = false;

        if(subArray.length <= originArray.length){
            for (int i = 0; i <originArray.length; i++){
                for(int j = 0; j < subArray.length; j++){
                    if(originArray[i+j] == subArray[j]){
                       result = true;
                       i++;
                    } else break;
                }
            }
        }
        return result;
    }
}
