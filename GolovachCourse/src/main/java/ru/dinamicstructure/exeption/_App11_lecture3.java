package ru.dinamicstructure.exeption;

public class _App11_lecture3 {

    public static void main(String[] args) {
        System.err.println(0);
        try {
            throw new RuntimeException();
        } catch (Throwable t) {
            if(t instanceof RuntimeException) {

            }else {
                if(t instanceof Exception) {

                }else {
                    if(t instanceof  Error) {

                    }
                }
            }
        }
        System.err.println(1);
    }
}
