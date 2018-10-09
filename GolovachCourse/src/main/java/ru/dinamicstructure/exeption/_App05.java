package ru.dinamicstructure.exeption;

import java.io.IOException;

public class _App05 {

    public static void main(String[] args) throws IOException {
        try {
            int area = area(-10, 20);
            System.out.println(area);
        }catch (IllegalArgumentException e) {
            System.out.println("Bad...");
        }
        System.out.println("Next");
    }

    private static int area(int width, int height) {

        if(width < 0 || height < 0) {
            throw new IllegalArgumentException("width < 0 || height < 0 = true");
        }
        return height*width;
    }
}
