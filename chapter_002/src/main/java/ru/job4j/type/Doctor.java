package ru.job4j.type;

public class Doctor extends Profession {

    public Doctor(String name) {
        super(name);
    }

    public void treat(Patient patient) {

        System.out.println("Доктор " + getName().toString() + "лечит пациента " +  patient.getName().toString());

    }
}
