package ru.Zlatopolskiy.Task8_14october;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

private String name;
private String surname;
private String middleName;
private LocalDate hireDate;

    public Employee(String name, String surname, String middleName, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return name +  " " + surname + " " + middleName;
    }
}
