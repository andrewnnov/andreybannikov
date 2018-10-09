package ru.Zlatopolskiy.Task8_14october;
/*
Дано предложение. Поменять местами его первое и последнее слово.
 */

import java.util.ArrayList;
import java.util.List;

public class Task9_166 {

    public String exchangeWordInSentence(String sentence) {
        String[] words = sentence.split("\\s");

        String tmp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tmp;
        String newStr = String.join(" ", words);
        return newStr;

    }
}
