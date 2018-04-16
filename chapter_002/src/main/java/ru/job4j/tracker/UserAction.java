package ru.job4j.tracker;

public interface UserAction {

    int key();

    //метод, который выполняет основные действия
    void execute(Input input, Tracker tracker);

    String info();
}
