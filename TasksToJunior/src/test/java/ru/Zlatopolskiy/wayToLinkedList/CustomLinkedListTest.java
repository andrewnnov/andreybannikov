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


        assertEquals(true, listString.add("wow"));

        assertEquals(1, listString.size());

        //assertEquals(true, listString.add("wtf"));
       // assertEquals("wtf", listString.get(1));
       // assertEquals(2, listString.size());

        for (int i = 0; i < listString.size() ; i++) {
            System.out.println(listString.get(i));

        }

    }

}
