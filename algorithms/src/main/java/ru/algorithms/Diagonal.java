package ru.algorithms;

public class Diagonal {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i > j) ? "1" : "0");
            }
            System.out.println();
        }
    }
}
