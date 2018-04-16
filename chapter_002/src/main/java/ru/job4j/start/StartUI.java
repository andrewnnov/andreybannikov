package ru.job4j.start;


import ru.job4j.item.Item;
import ru.job4j.tracker.ConsoleInput;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.MenuTracker;
import ru.job4j.tracker.Tracker;

/**
 * @version$Id&
 * @since 0.1
 */
public class StartUI {
    /**
     * Получение данных от пользователя
     */
    private final Input input;

    /**
     * Items's array
     */
    private final Tracker tracker;

    /**
     * Constructor init fields
     * @param input enter data.
     * @param tracker tems's array.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * main program cycle
     */
    public void init() {

        Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(this.input, tracker);
        menuTracker.fillActions();
        do {
            menuTracker.show();
            int key = Integer.valueOf(input.ask("Select:"));
            menuTracker.select(key);
        } while (!"y".equals(this.input.ask("Exit? (y)")));
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
