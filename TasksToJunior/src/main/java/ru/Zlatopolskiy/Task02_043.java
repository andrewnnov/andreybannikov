package ru.Zlatopolskiy;

/*
Даны два целых числа a и b. Если a делится на b или b делится на a, то вывес-ти 1, иначе — любое другое число. Условные операторы и операторы цикла не использовать.
 */
public class Task02_043 {


    public static void main(String[] args) {

        int a = 2;
        int b = 3;


        int e = (a + b)/a - (a + b)/b;

        System.out.println(e);

    }



}
