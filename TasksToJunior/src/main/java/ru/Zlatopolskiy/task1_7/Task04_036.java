package ru.Zlatopolskiy.task1_7;

/*
Работа светофора для пешеходов запрограммирована следующим образом: в
начале каждого часа в течение трех минут горит зеленый сигнал, затем в те-
чение двух минут — красный, в течение трех минут — опять зеленый и т. д.
Дано вещественное число t, означающее время в минутах, прошедшее с нача-
ла очередного часа. Определить, сигнал какого цвета горит для пешеходов в
этот момент.
 */

public class Task04_036 {

    public String determinationOfColor(int timeOfColor) {

        String result = null;

        int timeOfPedestrian = timeOfColor%5;

        if(timeOfPedestrian <= 3 && timeOfPedestrian > 0) {
            result = "Green";

        }if (timeOfPedestrian > 3 && timeOfPedestrian <= 5) {
            result = "Red";
        } if (timeOfPedestrian == 0) {
            result = "Red";
        }
        return result;
    }
}
