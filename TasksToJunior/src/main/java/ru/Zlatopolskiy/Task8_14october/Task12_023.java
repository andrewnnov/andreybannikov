package ru.Zlatopolskiy.Task8_14october;

/*
Заполнить двумерный массив размером 7 7 так, как показано на рис. 12.1.
 */

public class Task12_023 {


    public static void main(String[] args) {

        drawArrayA();
        drawArrayB();
        drawArrayC();
    }

    //a
    public static void drawArrayA() {

        int weight = 7;
        int height = 7;

        for (int i = 0; i < height  ; i++) {
            for (int j = 0; j < weight ; j++) {
                if((i == j) || i + j == height - 1) {
                    System.out.print(" 1 ");
                } else
                System.out.print(" 0 ");

            }
            System.out.println();

        }

        System.out.println("-------------------------");

    }

    //b
    public static void drawArrayB() {

        int weight = 7;
        int height = 7;

        for (int i = 0; i < height  ; i++) {
            for (int j = 0; j < weight ; j++) {
                if((i == j) || (i + j) == height - 1 || j == height/2 || i == height/2)    {
                    System.out.print(" 1 ");
                } else
                    System.out.print(" 0 ");

            }
            System.out.println();

        }
        System.out.println("-------------------------");

    }


    //c
    public static void drawArrayC() {

        int weight = 7;
        int height = 7;

        for (int i = 0; i < weight  ; i++) {
            for (int j = 0; j < height ; j++) {

               if(i <= height/2) {
                   System.out.print((i - j)<= 0 ? " 1 " : " 0 ");
               }else if(i > height/2) {
                   System.out.print((i - j) > 0   ? " 0 " : " 1 ");
               }


            }
            System.out.println();

        }

    }


}
