package ru.Zlatopolskiy.Task8_14october;

import java.util.Stack;

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

    //use StringBuffer

    public String invertAndPrintWordStringBuffer(String word) {
        StringBuffer newWord = new StringBuffer(word);

        return String.valueOf(newWord.reverse());
    }

    //use StringBuilder
    public String invertAndPrintWordStringBuilder(String word) {
        Stack<Character> st = new Stack<Character>();
        for (Character character : word.toCharArray()) {
            st.add(character);
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
