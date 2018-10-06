package ru.dinamicstructure.memoryInJava;

public class _App1 {

    public static void main(String[] args) {

        //будет работать бесконечно долго. Метод поиска достижимых(режим работы GC в java)
        //если бы работал методом подсчета ссылок, память бы закончилась

        Object[] ref = new Object[1];
        while (true){
            Object [] a = new Object[1];
            Object [] b = new Object[1];
            a[0] = b;
            b[0] = a;
            ref[0] = a;

        }
    }
}
