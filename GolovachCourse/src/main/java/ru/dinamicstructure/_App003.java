//package ru.dinamicstructure;
//
//public class _App003 {
//
//    public static void main(String[] args) {
//        Node tail = _(0 , 1, 2, 3);
//        System.out.println(toStringIter(tail));
//        //System.out.println(toStringRec(tail));
//
//    }
//
//    private static String toStringIter(Node tail) {
//        String result = "";
//        while (tail != null) {
//            result += tail.value + "->";
//            tail = tail.next;
//
//        }
//
//        return result + "*";
//    }
//
//    private static String toStringRec(Node tail) {
//        return (tail == null) ? "*" : tail.value + "->" + toStringRec(tail.next);
//
//    }
//
//    public static Node _(int...values) {
//        return values;
//    }
//}
