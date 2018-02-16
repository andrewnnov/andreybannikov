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
        /**
         * variable equal to the length of the array sub
         */
        int number = subArray.length;
        if(subArray.length <= originArray.length){
            for(int i = 0; i < subArray.length;){
                for (int j = 0; j < originArray.length;){
                    if(subArray[i] == originArray[j]){
                        i++;
                        j++;
                        number--;
                    } else{
                        j++;
                        if(j == originArray.length){
                            number = -1;
                        }
                    }
                }
                break;
            }
        } else {
            number = -1;
        }
        return number == 0 ? true : false;
    }
}
