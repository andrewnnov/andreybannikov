package ru.job4j.start;


import ru.job4j.item.Item;
import ru.job4j.tracker.ConsoleInput;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

/**
 * @version$Id&
 * @since 0.1
 */
public class StartUI {

    private static final String ADD = "0";
    private static final String SHOW_ALL_ITEMS = "1";
    private static final String EDIT_ITEM = "2";
    private static final String DELETE_ITEM = "3";
    private static final String FIND_ITEM_BY_ID = "4";
    private static final String FIND_ITEM_BY_NAME = "5";
    private static final String EXIT_PROGRAM = "6";

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод
                this.createItem();
            } else if (SHOW_ALL_ITEMS.equals(answer)) {
                this.showAllItems();
            } else if (EDIT_ITEM.equals(answer)) {
               this.editItem();
            } else if (DELETE_ITEM.equals(answer)) {
                this.deleteItem();
            } else if (FIND_ITEM_BY_ID.equals(answer)) {
                this.findItemById();
            } else if (FIND_ITEM_BY_NAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT_PROGRAM.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * find item by name
     */
    private void findItemByName() {
        System.out.println("--------Найти заявку по имени--------");
        String name = this.input.ask("Введите имя заявки :");
        for (Item item: tracker.findByName(name)) {
            System.out.println(item.getName() + " " + item.getId());
        }
    }

    /**
     * find item by id
     */
    private void findItemById() {
        System.out.println("--------Найти заявку по id--------");
        String id = this.input.ask("Введите id заявки :");
        System.out.println("Искомая заявка " + tracker.findById(id).getId());
    }

    /**
     * delete item
     */
    private void deleteItem() {
        System.out.println("------Удаление заявки---------");
        String id = this.input.ask("Введите id удаляемой заявки :");
        tracker.delete(id);
        System.out.println("Заявка " + id + " удалена");
    }

    /**
     * Edit item
     */
    private void editItem() {
        System.out.println("---------------Редактировать заявку--------------");
        String id = this.input.ask("Введите id редактируемой заявки :");
        String name = this.input.ask("Введите имя новой заявки :");
        String desc = this.input.ask("Введите описание новой заявки :");
        Item item = new Item(name, desc);
        item.setId(id);
        tracker.replace(id, item);
    }

    /**
     * Show all items
     */
    private void showAllItems() {
        System.out.println("-------Показать все заявки--------");
        this.tracker.findAll();
        for (Item item: tracker.findAll()
             ) {
            System.out.println("id заявки " + item.getId() + " " +  item.getName() + " " + item.getDescription());
        }
    }

    /**
     * add new item
     */
    private void createItem() {
        System.out.println("------------Добавление новой заявки------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("---------New item with getId() : " + item.getId() + "---------");
    }


    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
