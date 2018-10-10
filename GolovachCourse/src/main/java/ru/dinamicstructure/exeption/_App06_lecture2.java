package ru.dinamicstructure.exeption;

public class _App06_lecture2 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            f();
            System.err.println();
        }
    }

    private static void f() {
        for (int k = 0; k < 2; k++) {
            System.err.println(0);
            if(true) continue;
//            if(true) break;
//            if(true) return;
//            if(true) throw new Error();
            System.out.println(1);

        }
        System.err.println(2);
    }
}
