package ru.recursion;

public class AppFib_4 {
    public static void main(String[] args) {
        fib(5);
    }

    private static int fib(int arg) {
        int result = arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
        System.out.print(" " + arg);
        return result;
    }
}
