package ru.Zlatopolskiy;

import java.util.Scanner;

public class Task02_013 {

    /**
     * method revers input number
     * @param int number
     * @return revers int number
     */
    public int reversNumber(int number) {

        int result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public String reversNumber(String number) {

        StringBuilder stringBuilder = new StringBuilder(number);
        return stringBuilder.reverse().toString();

    }



}
