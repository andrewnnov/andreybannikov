package ru.dinamicstructure.memoryInJava;

public class _App4 {

    public static void main(String[] args) {
        Object[] ref = new Object[1];

        while (true) {
            ref[0] = new Object[1];
            ref = (Object[])ref[0];
        }
    }
}
