package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.item.Item;
import ru.job4j.item.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemTrackerHasNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "desc1", 123L);
        tracker.addNewItem(item);
        assertThat(tracker.getAllItems()[0], is(item));
    }

    @Test
    public void whenAddFewItemThenShowAllItems() {
        Tracker tracker = new Tracker();
        Item[] allItem = new Item[3];
        Item item = new Item("test1", "desc1", 123L);
        Item item2 = new Item("test2", "desc2", 123L);
        Item item3 = new Item("test3", "desc3", 123L);
        allItem[0] = item;
        allItem[1] = item2;
        allItem[2] = item3;
        tracker.addNewItem(item);
        tracker.addNewItem(item2);
        tracker.addNewItem(item3);
        Item[] resultItem = tracker.getAllItems();
        assertThat(resultItem, is(allItem));
    }
}
