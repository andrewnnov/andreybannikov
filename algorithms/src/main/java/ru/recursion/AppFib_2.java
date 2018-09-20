package ru.recursion;

public class AppFib_2 {
    public static void main(String[] args) {
        for( int k = 0; k < 100; k++) {
            System.out.println("fib(" + k + ") = " + fib(k));
        }
    }

    private static int fib(int arg) {
        return arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
        }
}
