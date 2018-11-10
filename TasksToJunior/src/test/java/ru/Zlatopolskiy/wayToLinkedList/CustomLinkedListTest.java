package ru.Zlatopolskiy.wayToLinkedList;

import org.junit.Test;
import ru.wayToLinkedList.CustomLinkedList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomLinkedListTest {

    @Test
    //////test add+++
    public void whenAddElementThenListAddNewElement() {
        List<String> listString = new CustomLinkedList();
        assertEquals(true, listString.add("1"));
        assertEquals(true, listString.add("2"));
        assertEquals(true, listString.add("3"));
        assertEquals("3", ((CustomLinkedList<String>) listString).get(2));

    }



    @Test
    //////test Remove first element
    public void whenRemoveFirstElementThenListBecomeLess() {
        List<String> listString = new CustomLinkedList();
        assertEquals(true, listString.add("1"));
        assertEquals(true, listString.add("2"));
        assertEquals(true, listString.add("3"));

        assertEquals("1", ((CustomLinkedList<String>) listString).removeFirst());
    }

    @Test
    //////test Remove Last element
    public void whenRemoveLastElementThenListBecomeLess() {
        List<String> listString = new CustomLinkedList();
        assertEquals(true, listString.add("1"));
//        assertEquals(true, listString.add("2"));
//        assertEquals(true, listString.add("3"));

        assertEquals("1", ((CustomLinkedList<String>) listString).removeLast());
        assertEquals(0, listString.size());
    }

    @Test
    //////test get element for index
    public void whenGetElementForIndexThenReturnElementOfIndex() {
        List<String> listString = new CustomLinkedList();
        assertEquals(true, listString.add("1"));
        assertEquals(true, listString.add("2"));
        assertEquals(true, listString.add("3"));

        //assertEquals("1", listString.get(0));
        assertEquals("1", listString.get(0));
        assertEquals("2", listString.get(1));
        assertEquals("3", listString.get(2));
    }


    @Test
    //////test get element for index
    public void whenRemoveElementForIndexThenReturnElementOfIndex() {
        List<String> listString = new CustomLinkedList();
        assertEquals(true, listString.add("1"));
        assertEquals(true, listString.add("2"));
        assertEquals(true, listString.add("3"));
        assertEquals(true, listString.add("4"));
        assertEquals(true, listString.add("5"));

        //assertEquals("1", listString.get(0));
        assertEquals("1", listString.remove(0));

        
    }

    @Test
    //////test define speed add element
    public void when1mlnElemThenOk() {

        List<String> listString = new CustomLinkedList<>();
        List<String> listStringJDK = new LinkedList<>();

        measureAddInEndList(listString);
        measureAddInEndList(listStringJDK);
    }

    public void measureAddInEndList(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000 ; i++) {
            listString.add("1");
        }
        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время добавления миллиона эллементов " + time);
    }


    @Test

    public void whenRemoveElemFromStartListThenReturnTime() {

        List<String> listString = new CustomLinkedList<>();
        List<String> listStringJDK = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            listString.add("1");
            listStringJDK.add("1");
        }


        measureRemoveElFromStartPosition(listString);
        measureRemoveElFromStartPosition(listStringJDK);

        measureRemoveElFromEndPosition(listString);
        measureRemoveElFromEndPosition(listStringJDK);


        measureRemoveElFromCentrPosition(listString);
        measureRemoveElFromCentrPosition(listStringJDK);
    }


    public void measureRemoveElFromStartPosition(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            listString.remove(0);
        }


            long finishTime = System.currentTimeMillis();

            long time = finishTime - startTime;
            System.out.println("Время удаления из начала листа " + time);

    }

    public void measureRemoveElFromEndPosition(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 999_9999; i < 999_900; i--) {
            listString.remove(i);
        }


        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время удаления последних элементов листа " + time);
    }


    public void measureRemoveElFromCentrPosition(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 500_000; i < 500_100; i++) {
            listString.remove(i);
        }


        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время удаления средних элементов листа " + time);
    }

}
