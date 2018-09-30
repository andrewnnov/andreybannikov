package ru.Zlatopolskiy;

/*
Даны целые числа h, m, s (0 < h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), указывающие
момент времени: "h часов, m минут, s секунд". Определить угол (в градусах)
между положением часовой стрелки в начале суток и в указанный момент
времени.
 */

public class Task02_039 {

    int h;
    int m;
    int s;

    public double angleWatch (int h, int m, int s) {
        if(h > 12) {
            return (h-12)*30 + (m * 6)/12 + (s * 0.1)/720;
        } else
        return h*30 + (m * 6)/12 + (s * 0.1)/720;
    }
}
