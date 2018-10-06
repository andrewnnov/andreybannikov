package ru.dinamicstructure.memoryInJava;

public class _App {

    public static void main(String[] args) {

        //GC delete all object besides one(программа не заполнит память)
        Object ref;
        while (true){
            ref = new Object();
        }
    }
}
