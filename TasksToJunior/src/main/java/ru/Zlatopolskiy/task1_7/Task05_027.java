package ru.Zlatopolskiy.task1_7;

/*
Найти:
а) сумму всех целых чисел от 100 до 500;
б) сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры;
a 500);
в) сумму всех целых чисел от –10 до b (значение b вводится с клавиатуры;
b –10);
г) сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры;
b a).
 */

import java.util.Scanner;

public class Task05_027 {

    public void getNumberFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        int numberFromKeyBoardOne = scanner.nextInt();
        int numberFromKeyBoardTwo = scanner.nextInt();
    }


    //a
    public int sumRangeOfNumbers() {
        int result = 0;
        for (int i = 1; i <= 5 ; i++) {
            result = result + i;
        }
        return result;
    }

    //б
    public int sumRangeOfNumbersAto500(int a) {
        int result = 0;
        if(a <= 500) {
            for (int i = a; i <= 500 ; i++) {
                result = result + i;
            }
        } else {
            result = -1111;
        }
        return result;

    }

    //в
    public int sumRangeOfMinus10toB(int b) {
        int result = 0;
        if(b >= -10) {
            for (int i = -10; i <= b ; i++) {
                result = result + i;
            }
        } else {
            result = -1111;
        }
        return result;
    }

    //г
    public int sumRangeOfMinus10toB(int a, int b) {
        int result = 0;
        if(b >= a) {
            for (int i = a; i <= b ; i++) {
                result = result + i;
            }
        } else {
            result = -1111;
        }
        return result;
    }
}
