package ru.Zlatopolskiy.task1_7;

/*
Напечатать таблицу перевода 1, 2, ... 20 долларов США в рубли по текущему курсу (значение курса вводится с клавиатуры).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task05_010 {


    public static void main(String[] args) {
        enterTheCourseFromKeyBoard();


    }

    public static void enterTheCourseFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        int courseDollarToRouble = scanner.nextInt();
        exchangeMoney(courseDollarToRouble);
    }



    public static double[] exchangeMoney(double course) {
        int[] dollars = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double[] rub = new double[dollars.length];
        System.out.printf("%3d", Arrays.toString(dollars));

        for (int i = 0; i < dollars.length; i++) {
            rub[i] = dollars[i] * course;
        }
        System.out.printf("%3d", Arrays.toString(rub));

//        for (int i = 0; i < rub.length ; i++) {
//
//            for (int j = 0; j <dollars.length ; j++) {
//                System.out.println((dollars[j]+ " "));
//
//
//
//            }
//            System.out.println(rub[i]);
//
//
//        }

        return rub;

    }
}
