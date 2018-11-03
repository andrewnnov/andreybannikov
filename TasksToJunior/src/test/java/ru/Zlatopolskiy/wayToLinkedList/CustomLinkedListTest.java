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
        listString.add("1");
        listString.add("2");
        listString.add("3");


//        assertEquals(true, listString.add("1"));
//        assertEquals(true, listString.add("2"));
//        assertEquals(true, listString.add("3"));
//
//        assertEquals(3, listString.size());

        assertEquals("1", listString.get(0));
      //  assertEquals("2", listString.get(1));
       // assertEquals("wtf", listString.get(1));
       // assertEquals(2, listString.size());

//        for (int i = 0; i < listString.size() ; i++) {
//            System.out.println(listString.get(i));
//
//        }

    }

}
