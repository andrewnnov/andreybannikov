package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Employee;
import ru.Zlatopolskiy.Task8_14october.Task13_12;
import ru.Zlatopolskiy.Task8_14october.Task9_42;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task13_12Test {

    @Test
    public void when2EmloyeeMore3ThenPrint2() {

        Employee[] employees = new Employee[4];
        Employee em1 = new Employee("Иван", "Иванов", "Иванович", 2011, 12, 01);
        Employee em2 = new Employee("Петр", "Петров", "Петрович", 2012, 12, 01);
        Employee em3 = new Employee("Сергей", "Сергеев", "Сергеевич", 2014, 11, 01);
        Employee em4 = new Employee("Андрей", "Андреев", "Андреевич", 2016, 12, 01);

        employees[0] = em1;
        employees[1] = em2;
        employees[2] = em3;
        employees[3] = em4;

        List<Employee>  employeeList = new ArrayList<>();
        employeeList.add(em1);
        employeeList.add(em2);

        Task13_12 task = new Task13_12();
        assertEquals(employeeList, task.findEmployee(employees));
        System.out.println(employeeList);
        System.out.println(task.findEmployee(employees));
    }
}
