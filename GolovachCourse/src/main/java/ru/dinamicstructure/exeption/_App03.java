package ru.dinamicstructure.exeption;

import java.io.IOException;

public class _App03 {

    public static void main(String[] args) throws IOException {
        int area = area(-10, 20);
        System.out.println("Area = " + area);
    }

    private static int area(int width, int height) {

        if(width < 0 || height < 0) {
            throw new IllegalArgumentException("width < 0 || height < 0 = true");
        }
        return height*width;
    }
}
