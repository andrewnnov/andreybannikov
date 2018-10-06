package ru.Zlatopolskiy.task1_7;
/*
Дано слово. Вывести на экран его k-й символ.
 */


public class Task09_015 {

    public String identifyOfSymbol(int numberOfWord, String incomingWorld) {

        int k = numberOfWord;
        char[] charArray = incomingWorld.toCharArray();
        int length = charArray.length;
        return String.valueOf(charArray[k]);

    }



}
