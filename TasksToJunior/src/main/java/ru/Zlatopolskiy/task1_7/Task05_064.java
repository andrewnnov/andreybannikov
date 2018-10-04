package ru.Zlatopolskiy.task1_7;

/*
В области 12 районов. Известны количество жителей (в тысячах человек)
и площадь (в км2) каждого района. Определить среднюю плотность населения
по области в целом.
 */

import java.util.Scanner;

public class Task05_064 {

    public static void main(String[] args) {
        double [] areaSquare = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 2000, 3000};
        int [] numberOfHuman = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};

        System.out.println(averageDensity(areaSquare, numberOfHuman));
    }


    public static double averageDensity(double[] array1, int[] array2) {
        double result = 0;

        for (int i = 0; i < array1.length ; i++) {

            result =array1[i]/array2[i] + result;

        }


        return result/array1.length;

    }







//    public static void main(String[] args) {
//        //System.out.println("Средняя плотность жителей всех районов равна " + averageDensityIter(2));
//        //System.out.println("Средняя плотность жителей всех районов равна " + averageDensityRec(2));
//        System.out.println(enterTheKeyboard(2));
//
//    }
//
//    public static double enterTheKeyboard(int n) {
//        int count = 0;
//        double result = averageDensityIter(0, 0);
//        if(count <= n) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите площадь района: ");
//            double area = scanner.nextDouble();
//            System.out.println("Введите количество жителей района: ");
//            int numberOfHuman = scanner.nextInt();
//            averageDensityIter(area, numberOfHuman);
//            result = averageDensityIter(area, numberOfHuman) + result;
//            count++;
//
//        }
//
//        return result/n;
//
//
//    }
//
//
//    public static double averageDensityIter(double area, double numberOfHuman) {
//
//
//            return area/numberOfHuman;
//    }
//
////    public static double averageDensityRec(int n) {
////        int count = 0;
////        double result = 0;
////
////            Scanner scanner = new Scanner(System.in);
////            System.out.println("Введите площадь района: ");
////            double area = scanner.nextDouble();
////            System.out.println("Введите количество жителей района: ");
////            int numberOfHuman = scanner.nextInt();
////
////
////            result = area/numberOfHuman + result;
////           // count++;
////
////
////        return n == 0  ? result/n : averageDensityRec(n - 1);
////    }




}
