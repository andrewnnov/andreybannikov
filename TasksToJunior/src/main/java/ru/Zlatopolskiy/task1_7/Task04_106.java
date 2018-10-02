package ru.Zlatopolskiy.task1_7;


/*
Составить программу, которая в зависимости от порядкового номера дня ме-
сяца (1, 2, ..., 12) выводит на экран время года, к которому относится этот
месяц.
 */

public class Task04_106 {

    public String determinateOfSeasons(int month) {
        String result = "Недопустимое значение";

        if(month >= 1 && month < 3 || month == 12) {
            result = "Winter";
        } else if(month >=3 && month < 6) {
            result = "Spring";
        } else if(month >= 6 && month < 9) {
            result = "Summer";
        } else if(month >= 9 && month <= 11) {
            result = "Autumn";
        }
        return result;
    }
}
