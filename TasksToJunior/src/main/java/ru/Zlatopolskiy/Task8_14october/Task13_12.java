package ru.Zlatopolskiy.Task8_14october;

/*
Известна информация о 20 сотрудниках фирмы: фамилия, имя, отчество,
адрес и дата поступления на работу (месяц, год). Напечатать фамилию,
имя, отчество и адрес сотрудников, которые на сегодняшний день
прорабо-тали в фирме не менее трех лет. День месяца не учитывать
(при совпадении месяца поступления и месяца сегодняшнего дня считать, что прошел пол-ный год).
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task13_12 {


    public List<Employee> findEmployee(Employee[] employees) {

        int numberOfEmployee = employees.length;
        LocalDate todayDate = LocalDate.now();
        int monthToday = todayDate.getMonthValue();
        int yearToday = todayDate.getYear();

        List<Employee> listEmployee = new ArrayList<>();


        for (Employee el: employees) {

            if(monthToday < el.getHireDate().getMonthValue() && yearToday - el.getHireDate().getYear() - 1 > 3)  {
                listEmployee.add((el));
            } else if (monthToday >= el.getHireDate().getMonthValue() && yearToday - el.getHireDate().getYear() > 3) {
                listEmployee.add((el));
            }


        }
        return listEmployee;

    }


}
