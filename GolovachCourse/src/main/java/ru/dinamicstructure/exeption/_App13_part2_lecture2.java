package ru.dinamicstructure.exeption;

public class _App13_part2_lecture2 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    private static int f() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
