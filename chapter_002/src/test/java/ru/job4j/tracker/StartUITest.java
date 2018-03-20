package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.item.Item;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.item.Item;
import ru.job4j.start.StartUI;

public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0","test name","desc","6"});
        new StartUI(input, tracker).init();
        String expectedName = "test name";
        assertThat(tracker.findAll()[0].getName(), is(expectedName));
    }

    @Test
    public void whenUserAddItemThenTrackerShowAllItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0","test name","desc","0","test name1","desc1", "1", "6"});
        new StartUI(input, tracker).init();
        String expectedName = "test name1";
        assertThat(tracker.findAll()[1].getName(), is(expectedName));
    }

    @Test
    public void whenUserEditItemThenTrackerShowEditedItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Test0", "desc0"));
        Input input = new StubInput(new String[]{"2",item.getId(),"TestNew", "descNew","6"});
        new StartUI(input, tracker).init();
        String expectedName = "TestNew";
        assertThat(tracker.findAll()[0].getName(), is(expectedName));
    }

    @Test
    public void whenUserDeleteItemThenTrackerShowNotItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name1", "desc1"));
        Input input = new StubInput(new String[]{"0","test name2","desc2", "3", item.getId(),"6"});
        new StartUI(input, tracker).init();
        String expectedName = "test name2";
        assertThat(tracker.findAll()[0].getName(), is(expectedName));
    }

    @Test
    public void whenUserFindItemThenTrackerShowItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name1", "desc1"));
        Input input = new StubInput(new String[]{"4", item.getId(),"6"});
        new StartUI(input, tracker).init();
        String expectedName = "test name1";
        assertThat(tracker.findAll()[0].getName(), is(expectedName));
    }
    @Test
    public void whenUserFindItemByNameThenTrackerShowItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name1", "desc1"));
        Input input = new StubInput(new String[]{"0","test name1","desc2", "5", item.getName(),"6"});
        new StartUI(input, tracker).init();
        Item[] expectedName = {tracker.findAll()[0], tracker.findAll()[1]};
        assertThat(tracker.findAll(), is(expectedName));
    }
}
