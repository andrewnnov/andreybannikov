package ru.dinamicstructure;

import static ru.dinamicstructure._App20Merge._;

public class _App20_copy_isEqual {

    public static void main(String[] args) {

        Node tailA = _(1,2,3,4);
        Node tailB = copy(tailA);
        System.out.println("a: " + toString(tailA));
        System.out.println("b: " + toString(tailB));
        System.out.println("isEqual: " + isEqual(tailA, tailB));
        System.out.println("----------");
        tailB.next.next.value = 1000;
        System.out.println("a: " + toString(tailA));
        System.out.println("b: " + toString(tailB));
        System.out.println("isEqual: " + isEqual(tailA, tailB));


    }

    // копирование списка
    public static Node copy(Node tail) {
        return tail == null ? null : new Node(tail.value, copy(tail.next));
    }

    //сравнение двух списков
    public static boolean isEqual(Node tailA, Node tailB)  {
        if(tailA != null && tailB != null) {
            return (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);
        } else {
            return tailA == tailB;}

    }

    public static String toString(Node tail) {
        return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
    }


}
