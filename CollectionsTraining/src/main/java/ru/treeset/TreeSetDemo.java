package ru.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Z");
        ts.add("B");
        ts.add("Y");
        ts.add("D");
        ts.add("F");
        ts.add("G");
        ts.add("H");
        ts.add("I");

        System.out.println(ts);
    }
}
