package ru.recursion;

public class App01_1 {

    public static void main(String[] args) {
        f(1);
    }

    private static void f(int arg) {
        System.out.println(" " + arg);

        if(arg < 7) {
            f(2 * arg);
        }
        System.out.println(" " + arg);
    }
}
