package ru.job4j.tracker;

import ru.job4j.item.Item;

   class EditItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("---------------Редактировать заявку--------------");
        String id = input.ask("Введите id редактируемой заявки :");
        String name = input.ask("Введите имя новой заявки :");
        String desc = input.ask("Введите описание новой заявки :");
        Item item = new Item(name, desc);
        item.setId(id);
        tracker.replace(id, item);
    }
    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit items");
    }
}

public class MenuTracker {
    private  Input input;
    private Tracker tracker;
    //пока предположим, что у нас всего 5 действий
    private UserAction[] actions = new UserAction[6];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0]= new AddItem();
        this.actions[1]= new MenuTracker.ShowAllItems();
        this.actions[2]= new EditItem();
        this.actions[3]= new DeleteItems();
        this.actions[4]= new FindItemByID();
        this.actions[5]= new FindItemByName();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action: this.actions) {
            if(action != null){
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------Добавление новой заявки------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc);
            tracker.add(item);
            //System.out.println("---------New item with getId() : " + item.getId() + "---------");
            //System.out.println(item);
        }
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add new item.");
        }
    }

    private static class ShowAllItems implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("-------Показать все заявки--------");
            for (Item item: tracker.findAll()) {
                System.out.println(String.format("%s. %s", item.getId(), item.getName()));
            }
        }
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }

    private class DeleteItems implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------Удаление заявки---------");
            String id = input.ask("Введите id удаляемой заявки :");
            tracker.delete(id);
            System.out.println("Заявка " + id + " удалена");
        }
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }

    private class FindItemByID implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("--------Найти заявку по id--------");
            String id = input.ask("Введите id заявки :");
            System.out.println("Искомая заявка " + tracker.findById(id).getId());
        }
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id");
        }
    }

    private class FindItemByName implements UserAction {

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("--------Найти заявку по имени--------");
            String name = input.ask("Введите имя заявки :");
            for (Item item: tracker.findByName(name)) {
                System.out.println(item);
            }
        }
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name");
        }
    }
}
