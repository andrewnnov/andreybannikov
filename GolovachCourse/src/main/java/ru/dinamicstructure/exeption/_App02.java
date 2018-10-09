package ru.dinamicstructure.exeption;

public class _App02 {

    public static void main(String[] args) {
        int area = area(-10, 20);
        System.out.println("Area = " + area);
    }

    private static int area(int width, int height) {

        if(width < 0 || height < 0) {
            System.out.println("Incorrect arguments. Buy");
            System.exit(0);
        }
        return height*width;
    }
}
