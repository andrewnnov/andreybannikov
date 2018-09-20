package ru.recursion;

public class App01 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int arg) {
        if(arg < 7) {
            f(2 * arg);
        }
        System.out.println(" " + arg);
    }
}
