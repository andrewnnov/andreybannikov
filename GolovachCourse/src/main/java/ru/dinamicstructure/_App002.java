package ru.dinamicstructure;

import java.util.Arrays;

public class _App002 {

    public static void main(String[] args) {
        Node tail = genIter(0, 1, 2, 3);
    }

    public static Node genIter(int...values) {
        Node tail =null;
        for(int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }

    public static Node genRecFull(int...v) {
        if(v.length == 0) return null;

        else {
            int[] newArray = Arrays.copyOfRange(v, 1, v.length);
            return new Node(v[0], genRecFull(newArray));
        }
    }
}
