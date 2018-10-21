package ru.dinamicstructure.exeption;

public class _App12_part2_lecture1 {

//    public static void main(String[] args) {
//        System.err.println(0);
//        try {
//            System.err.println(1);
//            if(true) throw  new Error();
//        } finally {
//            System.err.println(2);
//        }
//        System.err.println(3);
//    }

    public static void main(String[] args) {
        System.err.println(0);
        try {
            System.err.println(1);
            if(true) throw  new Error();
        } finally {
            System.err.println(2);
            //very bed style use return in finally!!!
            //it is kill exception
            if(true) return;
        }
        System.err.println(3);
    }


}
