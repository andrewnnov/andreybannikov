package wayToArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_05;
import ru.wayToArrayList.CustomArrayList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CustomArrayListTest {



    @Test
    //////test add+++
    public void whenAddElementThenListAddNewElement() {
        List<String> listString = new CustomArrayList();


        assertEquals(true, listString.add("wow"));

        assertEquals(1, listString.size());

        assertEquals(true, listString.add("wtf"));
        assertEquals("wtf", listString.get(1));
        assertEquals(2, listString.size());

        for (int i = 0; i < listString.size() ; i++) {
            System.out.println(listString.get(i));

        }

    }

    @Test
    //////test add with index+++

    public void whenAddElementAndIndexThenListAddNewElement() {
        List<String> listString = new CustomArrayList();
        listString.add(0, "zero");
        listString.add(1, "one");
        listString.add(2, "three");
        listString.add(3, "three");
        listString.add(4, "three");
        listString.add(5, "three");
        listString.add(6, "three");
        listString.add(7, "three");
        listString.add(8, "three");
        listString.add(9, "three");
        listString.add(10, "ya-ya");
        listString.add(2, "ya-ya");
        assertEquals("zero", listString.get(0));
        assertEquals("one", listString.get(1));
        for (int i = 0; i < listString.size() ; i++) {
            System.out.println(listString.get(i));

        }
    }

    @Test
    //////test get+++
    public void whenWantToGetElThenEnterIndexOfElement() {
        List<String> listString = new CustomArrayList();
        listString.add(0, "zero");
        listString.add(1, "one");
        listString.add(2, "three");

        assertEquals("one", listString.get(1));


    }

    @Test
    //////test indexOf
    public void whenWantToIndexOfElThenReturnElement() {
        List<String> listString = new CustomArrayList();
        listString.add(0, "zero");
        listString.add(1, "one");
        listString.add(2, "three");
        String expected = listString.get(1);
        assertEquals(expected, listString.get(1));
        int result = listString.indexOf("one");
        assertEquals(1, result);
    }


    @Test

    //////test remove
    public void whenRemoveOfElThenReturnNewArrayMinusOneElement() {
        List<String> listString = new CustomArrayList();
        listString.add(0, "zero");
        listString.add(1, "one");
        listString.add(2, "three");

        String result = listString.remove(1);

        assertEquals("one", result);
//        for (String el: listString) {
//            System.out.println(el);
//        }
    }


    @Test

    //////test set
    public void whenSetOfElThenReturnNewArrayWithOneNewElement() {
        List<String> listString = new CustomArrayList();
        listString.add(0, "zero");
        listString.add(1, "one");
        listString.add(2, "three");



        listString.set(1, "wtf");
        String newEl = listString.get(1);

        assertEquals("wtf", newEl);


    }

    @Test
    //////test add+++
    public void when1mlnElemThenOk() {


        List<String> listString = new CustomArrayList();

        for (int i = 0; i < 500_000 ; i++) {
            listString.add("1");
        }

    }
























}
