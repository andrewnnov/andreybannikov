package ru.Zlatopolskiy.Task8_14october;

/*
Дано слово. Поменять местами его m-ю и n-ю буквы.
 */

//Вопрос. Массив с нуля. Пользователь вводит с единцы

public class Task9_102 {


    public String reversLetterInTheWord(String word, int n, int m) {

        int lengthWord = word.length();

        char[] arrayLetterTheWord = word.toCharArray();
        System.out.println(arrayLetterTheWord);

        char tmp = arrayLetterTheWord[n - 1];
        arrayLetterTheWord[n-1] = arrayLetterTheWord[m-1];
        arrayLetterTheWord[m - 1] = tmp;

        String reversWord = new String(arrayLetterTheWord);
        System.out.println(arrayLetterTheWord);
        return reversWord;
    }
}
