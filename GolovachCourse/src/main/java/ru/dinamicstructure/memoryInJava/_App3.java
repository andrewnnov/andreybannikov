package ru.dinamicstructure.memoryInJava;

public class _App3 {

//    public static void main(String[] args) {
//
//        //все объекты достижимы. Но придется долго ждать перепеолнения памяти. Односвязный список
//        Object[] ref = new Object[1];
//        int counter = 0;
//
//        while (true) {
//
//            ref = new Object[]{ref};
//            System.out.println(counter++);
//        }
//    }

    //чтобы память скорее закончилась
    public static void main(String[] args) {

        //все объекты достижимы. Но придется долго ждать перепеолнения памяти. Односвязный список
        Object[] ref = new Object[1];
        int counter = 0;

        while (true) {

            ref = new Object[]{ref, new char[1_000_000]};
            System.out.println(counter++);
        }
    }


}
