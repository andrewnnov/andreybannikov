package ru.Zlatopolskiy.Task8_14october;

/*
Составить программу, которая печатает заданное слово, начиная с последней буквы.
 */
public class Task9_42 {

//    public static void main(String[] args) {
//
//        System.out.println(invertAndPrintWord("Кошка"));
//
//    }

    
    public String invertAndPrintWord(String word) {
        
        int lengthWord = word.length();
        char[] invertWord = new char[lengthWord];

        for (int i = 0; i < lengthWord; i++) {

            invertWord[i] = word.charAt(lengthWord - 1 - i);
            
        }

        String newString = new String(invertWord);

        return newString;
        
    }
}
