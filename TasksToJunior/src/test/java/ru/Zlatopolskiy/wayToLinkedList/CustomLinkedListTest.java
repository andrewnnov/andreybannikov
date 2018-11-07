package ru.Zlatopolskiy.wayToLinkedList;

import org.junit.Test;
import ru.wayToArrayList.CustomArrayList;
import ru.wayToLinkedList.CustomLinkedList;

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
        assertEquals("3", listString.get(2));


    }







}
