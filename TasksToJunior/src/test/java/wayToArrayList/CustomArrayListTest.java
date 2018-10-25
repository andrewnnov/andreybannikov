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

    List<String> listString;
    List<Integer> listInteger;


    @Before

    public void create() {
        listInteger = new ArrayList<>();
        listString = new ArrayList<>();
        listString.add(0, "zero");
        listString.add(1, "one");
        listString.add(2, "three");

        listInteger.add(0, 3);
        listInteger.add(0, 5);
        listInteger.add(0, 24);

    }

    @Test
    //////test add
    public void whenAddElementThenListAddNewElement() {
//       listString.add(0, "zero");
//       listString.add(1, "one");
        assertEquals("zero", listString.get(0));
        assertEquals("one", listString.get(1));
    }

    @Test
    //////test get
    public void whenWantToGetElThenEnterIndexOfElement() {

        assertEquals("one", listString.get(1));

        Integer expected = 5;
        assertEquals(expected, listInteger.get(1));
    }

    @Test
    //////test indexOf
    public void whenWantToIndexOfElThenReturnElement() {
        String expected = listString.get(1);
        assertEquals(expected, listString.get(1));
        int result = listString.indexOf("one");
        assertEquals(1, result);
    }


    @Test
    @Ignore
    //////test indexOf
    public void whenRemoveOfElThenReturnNewArrayMinusOneElement() {
//        String expected = listString.get(1);
//        assertEquals(expected, listString.get(1));
//        int result = listString.indexOf("one");
//        assertEquals(1, result);
    }















}
