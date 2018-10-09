package ru.dinamicstructure.exeption;

public class _App01 {

    public static void main(String[] args) {
        int area = area(-10, 20);
        if(area == -1) {
            System.out.println("Bad...");
        } else
            System.out.println("Area = " + area);
    }

    private static int area(int width, int height) {

        if(width < 0 || height < 0) {
            return -1;
        }
        return height*width;
    }
}
