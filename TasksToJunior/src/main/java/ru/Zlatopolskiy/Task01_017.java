package ru.Zlatopolskiy;
import java.lang.Math;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.StrictMath.cos;

public class Task01_017 {

    private static double x1;
    private static double x2;
    private static double x3;
    private static double m;
    private static double v;
    private static double h;
    private static double g;
    private static double R1;
    private static double R2;
    private static double a;
    private static double R;
    private static double b;
    private static double c;
    private static double I;
    private static double d;
    private static double x;
    private static double v0;
    private static double t;
    private static double gamma;
    private static double m1;
    private static double m2;
    private static double r;


    public static void main(String[] args) {

        //a
        double result1 = Math.sqrt(x1*x1 + x2*x2);

        //б
        double result2 = x1*x2 + x1*x3 + x2*x3;

        //в

        double result3 = v0 + (a*Math.pow(t, 2))/2;

        //г
        double result4 = (m * Math.pow(v, 2))/2 + m*g*h;

        //д
        double result5 = 1/R1 + 1/R2;

        //е

        double result6 = m * g * cos(a);

        //ж

        double result7 = 2 * PI * R;

        //з
        double result8 = Math.pow(b, 2) + 4 * a * c;

        //и

        double result9 = gamma*m1*m2/Math.pow(r, 2);

        //к
        double result10 = Math.pow(I, 2) * R;

        //л

        double result12 = a * b * Math.sin(c);

        //м

        double result13 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(c));

        //н
        double result14 = (a*d + b*c)/a*d;

        //о (неуверен)

        double result15 = Math.sqrt(1 - pow(sin(x), 2));

        //п

        double result16 = 1/ ((Math.sqrt(a * pow(x, 2)) + b*x + c));

        // р

        double result17 = (Math.sqrt(x + 1) + Math.sqrt(x - 1))/2* Math.sqrt(x);

        //c

        double result18  = Math.abs(x) + Math.abs(x + 1);

        //т

        double result19 = Math.abs(1 - Math.abs(x));
    }
}
