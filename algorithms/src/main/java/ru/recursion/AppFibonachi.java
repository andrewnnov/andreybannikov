package ru.recursion;

public class AppFibonachi {

    public static void main(String[] args) {
        for( int k = 0; k < 10; k++) {
            System.out.println("fib(" + k + ") = " + fib(k));
        }
    }

    private static int fib(int arg) {

        if (arg == 0) {
            return 1;
        }else if (arg == 1) {
            return 1;
        }else {
            return fib(arg - 2) + fib(arg -1);
        }


    }
}
