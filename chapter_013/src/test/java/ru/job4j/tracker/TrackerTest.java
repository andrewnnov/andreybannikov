package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.item.Item;
import ru.job4j.item.Tracker;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemTrackerHasNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "desc1", 123L);
        tracker.addNewItem(item);
        assertThat(tracker.getAllItems().get(0), is(item));
    }

    @Test
    public void whenAddFewItemThenShowAllItems() {
        Tracker tracker = new Tracker();
        List<Item> allItem = new ArrayList<>();
        Item item = new Item("test1", "desc1", 123L);
        Item item2 = new Item("test2", "desc2", 123L);
        Item item3 = new Item("test3", "desc3", 123L);
        allItem.add(item);
        allItem.add(item2);
        allItem.add(item3);

        tracker.addNewItem(item);
        tracker.addNewItem(item2);
        tracker.addNewItem(item3);
        List<Item> resultItem = tracker.getAllItems();
        assertThat(resultItem, is(allItem));
    }

    @Test
    public void whenFindElementForIdThenReplaysThisElement() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "desc1", 123L);
        Item item2 = new Item("test2", "desc2", 123L);
        Item item3 = new Item("test3", "desc3", 123L);

        tracker.addNewItem(item1);
        tracker.addNewItem(item2);
        tracker.addNewItem(item3);

        String id = item2.getIdOfItem();

        Item itemReplays = new Item("nameReplays", "descRaplays", 123l);

        tracker.replaceItem(id, itemReplays);

        assertThat(tracker.findById(id).getName(), is("nameReplays"));
    }

    @Test
    public void whenFindItemThenReturnItemsNames() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test", "desc1", 123L);
        Item item2 = new Item("test", "desc2", 123L);
        Item item3 = new Item("test3", "desc3", 123L);

        tracker.addNewItem(item1);
        tracker.addNewItem(item2);
        tracker.addNewItem(item3);

        List<Item> expect = new ArrayList<>();
        expect.add(item1);
        expect.add(item2);
        assertThat(tracker.findItemByName("test"), is(expect));
    }

    @Test
    public void whenDeleteItemThenItemMinusOne() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "desc1", 123L);
        Item item2 = new Item("test2", "desc2", 123L);
        Item item3 = new Item("test3", "desc3", 123L);

        tracker.addNewItem(item1);
        tracker.addNewItem(item2);
        tracker.addNewItem(item3);

        String idItem2 = item2.getIdOfItem();
        tracker.delete(idItem2);
        List<Item> expect = new ArrayList<>();
        expect.add(item1);
        expect.add(item3);
        assertThat(tracker.getAllItems(), is(expect));
    }




}
