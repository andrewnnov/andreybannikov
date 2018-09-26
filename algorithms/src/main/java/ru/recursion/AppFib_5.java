package ru.recursion;

public class AppFib_5 {
    public static void main(String[] args) {
        fib(5);
    }

    private static int fib(int arg) {
        return arg < 2 ? 1 : fib(arg - 2)+ _(arg) + fib(arg - 1);

    }

    private static int _(int arg) {
        System.out.print(" " + arg);
        return 0;
    }
}
