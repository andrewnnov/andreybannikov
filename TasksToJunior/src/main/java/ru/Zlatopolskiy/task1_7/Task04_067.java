package ru.Zlatopolskiy.task1_7;

/*
Дано целое число k (1 k 365). Определить, каким будет k-й день года: вы-
ходным (суббота и воскресенье) или рабочим, если 1 января — понедельник.
 */

public class Task04_067 {

    public String definitionDayOfWeek(int k) {

        String result = null;

        int tmp = k%7;

        if(tmp <6 && tmp > 0) {
            result = "Рабочий день";
        } else if(tmp == 6 || tmp == 0) {
            result = "Выходной";
        }

        return result;

    }
}
