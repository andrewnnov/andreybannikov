package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.item.Item;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2","testDescription2", 123L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteOneElementThenMoveAllElementLeft(){
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "testDescription", 123L);
        Item item1 = new Item("Test1", "testDescription1", 123L);
        Item item2 = new Item("Test2", "testDescription2", 123L);
        Item item3 = new Item("Test3", "testDescription3", 123L);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        String deletedElem = item2.getId();
        tracker.delete(deletedElem);
        assertThat(tracker.findAll()[2].getName(), is("Test3"));
    }
    @Test
    public void whenReturnItemsNoNull(){
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "testDescription", 123L);
        Item item1 = new Item("Test1", "testDescription1", 123L);
        Item item2 = new Item("Test2", "testDescription2", 123L);
        Item item3 = new Item("Test3", "testDescription3", 123L);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findAll().length, is(4));
    }
    @Test
    public void whenFindNameReturnArrayNamed(){
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "testDescription", 123L);
        Item item1 = new Item("Test", "testDescription1", 123L);
        Item item2 = new Item("Test2", "testDescription2", 123L);
        Item item3 = new Item("Test3", "testDescription3", 123L);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item [] expected = {item, item1};
        assertThat(tracker.findByName("Test"), is(expected));
    }
    @Test
    public void whenFindIdReturnItem(){
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "testDescription", 123L);
        Item item1 = new Item("Test", "testDescription1", 123L);
        Item item2 = new Item("Test2", "testDescription2", 123L);
        Item item3 = new Item("Test3", "testDescription3", 123L);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findById(item2.getId()), is(item2));
    }
}
