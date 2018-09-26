package ru.Zlatopolskiy;

/*
Записать условие, которое является истинным, когда:
а) каждое из чисел X и Y нечетное;
б) только одно из чисел X и Y меньше 20;
в) хотя бы одно из чисел X и Y равно нулю;
г) каждое из чисел X, Y, Z отрицательное;
д) только одно из чисел X, Y и Z кратно пяти;
е) хотя бы одно из чисел X, Y, Z больше 100.
 */

public class Task3_029 {



    public static void main(String[] args) {
        int x = 5;
        int y = 101;
        int z = 17;

        //a
        System.out.println("Пример А");
        if(x%2 != 0 && y%2 != 0) {
            System.out.println("Числа x и y нечетные");
        } else {
            System.out.println("Одно или оба числа четные");
        }

        //б
        System.out.println("Пример Б");

        if((x < 20 && y >= 20 || y < 20 && x >= 20)) {
            System.out.println("Одно из чисел меньше 20");
        } else {
            System.out.println("Условие не выполняется");
        }

        //в
        System.out.println("Пример В");
        if(x == 0 || y == 0) {
            System.out.println("Одно из чисел равно нулю");
        }

        //г
        System.out.println("Пример Г");
        if(x < 0 && y < 0 && z < 0) {
            System.out.println("Каждое из чисел отрицательное");
        }

        //д
        System.out.println("Пример Д");
        if(x%5 == 0 && y%5 != 0 && z%5 != 0 || x%5 != 0 && y%5 == 0 && z%5 != 0 || x%5 != 0 && y%5 != 0 && z%5 == 0 ) {
            System.out.println("Одно из чисел кратно пяти");
        } else {
            System.out.println("хрен вам");
        }

        //e

        System.out.println("Пример E");
        if(x > 100 || y > 100 || z > 100) {
            System.out.println("Хотя бы одно из чисел больше 100");
        } else {
            System.out.println("Условие не соблюдается");
        }





    }


}
