package ru.recursion;

public class AppFib_3 {
    public static void main(String[] args) {
        fib(5);
    }

    private static int fib(int arg) {
        System.out.print(" " + arg);
        return arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
    }
}
