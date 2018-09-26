package ru.Zlatopolskiy;

import java.util.Scanner;

public class Task01_003 {


    public static void main(String[] args) {
        System.out.println("Вы ввели число: " + enterNumberFromKeyBoard());
    }


    public static int enterNumberFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.close();
        return result;

    }
}
