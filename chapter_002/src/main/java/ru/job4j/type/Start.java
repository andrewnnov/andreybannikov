package ru.job4j.type;

public class Start {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Учитель");
        Engineer engineer = new Engineer("Инженер");
        Doctor doctor = new Doctor("Доктор");

        Student student = new Student("Студент");
        House house = new House("Небоскреб");
        Patient patient = new Patient("Пациент");

        teacher.learn(student);
    }
}
