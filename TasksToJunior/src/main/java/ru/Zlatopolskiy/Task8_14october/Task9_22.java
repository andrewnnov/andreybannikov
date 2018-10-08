package ru.Zlatopolskiy.Task8_14october;

/*
Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.
 */

public class Task9_22 {

    public static void main(String[] args) {
        System.out.println(printFirstHalfWord("Polo"));
    }



    public static String printFirstHalfWord(String word) {
        int lengthWord = word.length();
        return word.substring(0, lengthWord/2);
    }




}
