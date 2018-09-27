package ru.Zlatopolskiy;

import java.time.LocalDate;
import java.util.Date;

/*
Известны год и номер месяца рождения человека, а также год и номер месяца
сегодняшнего дня (январь — 1 и т. д.). Определить возраст человека (число
полных лет). В случае совпадения указанных номеров месяцев считать, что
прошел полный год.
 */
public class Task04_15 {

/*
method count age of people
 */
    public int returnAgeOfMan(int monthOfBorn, int yearOfBorn) {
        LocalDate todayDate = LocalDate.now();
        int monthToday = todayDate.getMonthValue();
        int yearToday = todayDate.getYear();

        return monthToday < monthOfBorn ? yearToday - yearOfBorn - 1 : yearToday - yearOfBorn;
    }

}
