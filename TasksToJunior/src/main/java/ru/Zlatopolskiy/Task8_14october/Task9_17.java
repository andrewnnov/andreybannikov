package ru.Zlatopolskiy.Task8_14october;

/*
Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
 */

public class Task9_17 {

    public boolean sameLetter(String word) {
//        boolean result = false;
//
        int lengthWord = word.length();
        return (word.charAt(0)== word.charAt(lengthWord -1)) ? true : false;
//
//        if(word.charAt(0)== word.charAt(lengthWord -1)) {
//            result = true;
//        } else {
//           result = false;
//        }
//        return result;


    }
}
