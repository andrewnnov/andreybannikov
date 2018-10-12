package ru.Zlatopolskiy.task1_7;

/*
Напечатать таблицу перевода 1, 2, ... 20 долларов США в рубли по текущему курсу (значение курса вводится с клавиатуры).
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Task05_010 {




    public static void main(String[] args) {
        enterTheCourseFromKeyBoard();
    }

    public static void enterTheCourseFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        String courseDollarToRouble = scanner.next();
        BigDecimal bd = new BigDecimal(courseDollarToRouble);
        exchangeMoney(bd);
    }



    public static BigDecimal[] exchangeMoney(BigDecimal course) {
        int[] dollars = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        BigDecimal[] rub = new BigDecimal[dollars.length];



       // double[] rub = new double[dollars.length];


        for (int i = 0; i < dollars.length; i++) {

            rub[i] = course.multiply(BigDecimal.valueOf(dollars[i]));
            rub[i].setScale(2, RoundingMode.HALF_UP);


            System.out.println(dollars[i] + "-------->" + rub[i]);


        }

        return rub;

    }
}
