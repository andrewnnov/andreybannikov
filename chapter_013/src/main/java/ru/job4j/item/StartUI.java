package ru.job4j.item;

public class StartUI {

    private static final String ADD = "0";
    private static final String FIND_BY_ID = "1";
    private static final String FIND_BY_NAME = "2";
    private static final String SHOW_ALL_ITEMS = "3";
    private static final String REPLAYS_ITEM = "4";
    private static final String DELETE_ITEM = "5";
    private static final String EXIT = "6";


    //Получение данных от пользователя
    private final Input input;


    //Хранилище заявок
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню: ");
            if(ADD.equals(answer)) {
                this.createItem();
            }else if(FIND_BY_ID.equals(answer)) {
                this.findByID();
            }else if(FIND_BY_NAME.equals(answer)) {
                this.findByName();
            }else if(SHOW_ALL_ITEMS.equals(answer)) {
                this.showAllItems();
            }else if(REPLAYS_ITEM.equals(answer)) {
                this.replaysItem();
            }else if(DELETE_ITEM.equals(answer)) {
                this.deleteItem();
            }else if(EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void deleteItem() {
        System.out.println("------Удаление заявки---------");
        String idOfItem = this.input.ask("Введите id удаляемой заявки: ");
        tracker.delete(idOfItem);
        System.out.println("Заявка " + idOfItem + " удалена");
    }

    private void replaysItem() {
        System.out.println("-----Редактирование заявки по Id-----");
        String idOfItem = this.input.ask("Введите id заявки");
        String name = this.input.ask("Введите имя новой заявки :");
        String desc = this.input.ask("Введите описание новой заявки :");
        Item item = new Item(name, desc);
        item.setIdOfItem(idOfItem);
        tracker.replaceItem(idOfItem, item);
    }

    private void showAllItems() {
        System.out.println("-----Показать все элементы-----");
        for (Item item: tracker.getAllItems()) {
            System.out.println(item.getIdOfItem() + " " +  item.getName() + " " + item.getDescription());
        }
    }


    private void createItem() {
        System.out.println("-----Добавление новой заявки-----");
        String name = this.input.ask("Введите имя заявки: ");
        String desc = this.input.ask("Введите описание заявки: ");
        Item item = new Item(name, desc);
        this.tracker.addNewItem(item);
        System.out.println("-----Новая заявка с Id: " + item.getIdOfItem() + " создана.");
    }

    private void findByID() {
        System.out.println("-----Поиск заявки по Id-----");
        String idOfItem = this.input.ask("Введите id заявки");
        System.out.println("-----Искомая заявка: " + this.tracker.findById(idOfItem).getIdOfItem() + this.tracker.findById(idOfItem).getName() + this.tracker.findById(idOfItem).getDescription());
    }

    private void findByName() {
        System.out.println("-----Поиск заявки по имени-----");
        String nameOfItem = this.input.ask("Введите имя заявки");
        for (Item item: tracker.findItemByName(nameOfItem)) {
            System.out.println(item.getIdOfItem() + item.getName());
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0 - Добавление заявки.");
        System.out.println("1 - Поиск заявки по Id.");
        System.out.println("2 - Поиск заявки по имени.");
        System.out.println("3 - Показать все заявки.");
        System.out.println("4 - Редактировать заявку.");
        System.out.println("5 - Удалить заявку.");
        System.out.println("6 - Выход.");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
