package ru.job4j.item;

public interface UserAction {

    int key();

    void execute(Input input, Tracker tracker);

    String info();


}
