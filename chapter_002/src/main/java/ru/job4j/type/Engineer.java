package ru.job4j.type;

public class Engineer extends Profession {

    public Engineer(String name) {
        super(name);
    }

    public void build(House house) {

        System.out.println("Инженер " + getName().toString() + "строит " +  house.getName().toString());

    }
}
