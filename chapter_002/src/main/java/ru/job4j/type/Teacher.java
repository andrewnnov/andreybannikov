package ru.job4j.type;

public class Teacher extends Profession {

    public Teacher(String name) {
        super(name);
    }

    public void learn(Student student) {

        System.out.println("Учитель " + getName() + " учит студента " + student.getName());

    }
}
