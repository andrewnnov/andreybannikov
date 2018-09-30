package ru.dinamicstructure;

public class _App20Merge {

    public static void main(String[] args) {

        Node tailA = _(10, 20, 30, 40);
        Node tailB = _(25, 25, 30, 45);
        System.out.println((tailA));
        System.out.println((tailB));
        System.out.println((merge(tailA, tailB)));
    }

    public static Node merge(Node tailA, Node tailB ) {
        if(tailA != null && tailB != null) {
            if(tailA.value < tailB.value) {
                return new Node(tailA.value, merge(tailA.next, tailB));
            }else {
                return new Node(tailB.value, merge(tailA, tailB.next ));
            }
        } else
            return (tailA == null) ? tailB : tailA;
    }

    public static Node _(int...values) {
        Node tail =null;
        for(int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }
}
