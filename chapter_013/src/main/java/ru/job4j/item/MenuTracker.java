package ru.job4j.item;

public class MenuTracker {

    private Input input;
    private Tracker tracker;

    private UserAction[] actions = new UserAction[6];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillAction() {
        this.actions[0] = new AddItem();
        this.actions[1] = new FindByID();
        this.actions[2] = new FindByName();
        this.actions[3] = new ShowAllItems();
        this.actions[4] = new ReplaysItems();
        this.actions[5] = new DeleteItems();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, tracker);
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
            System.out.println("-----Добавление новой заявки-----");
            String name = this.input.ask("Введите имя заявки: ");
            String desc = this.input.ask("Введите описание заявки: ");
            Item item = new Item(name, desc);
            this.tracker.addNewItem(item);
            System.out.println("-----Новая заявка с Id: " + item.getIdOfItem() + " создана.");

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }

    private class FindByID implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("-----Поиск заявки по Id-----");
            String idOfItem = this.input.ask("Введите id заявки");
            System.out.println("-----Искомая заявка: " + this.tracker.findById(idOfItem).getIdOfItem() + this.tracker.findById(idOfItem).getName() + this.tracker.findById(idOfItem).getDescription());
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id");;
        }
    }

    private class FindByName implements UserAction {

        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("-----Поиск заявки по имени-----");
            String nameOfItem = this.input.ask("Введите имя заявки");
            for (Item item: tracker.findItemByName(nameOfItem)) {
                System.out.println(item.getIdOfItem() + item.getName());
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name");
        }
    }

    private class ShowAllItems implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("-----Показать все элементы-----");
            for (Item item: tracker.getAllItems()) {
                System.out.println(item.getIdOfItem() + " " +  item.getName() + " " + item.getDescription());
            }

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }


    public class ReplaysItems implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("-----Редактирование заявки по Id-----");
            String idOfItem = this.input.ask("Введите id заявки");
            String name = this.input.ask("Введите имя новой заявки :");
            String desc = this.input.ask("Введите описание новой заявки :");
            Item item = new Item(name, desc);
            item.setIdOfItem(idOfItem);
            tracker.replaceItem(idOfItem, item);
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit items");
        }
    }

    public class DeleteItems implements UserAction {

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------Удаление заявки---------");
            String idOfItem = this.input.ask("Введите id удаляемой заявки: ");
            tracker.delete(idOfItem);
            System.out.println("Заявка " + idOfItem + " удалена");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }




}
