package wayToArrayList;

import org.junit.Test;
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
    //////test define speed add to the end list
    public void when1mlnElemThenOk() {



        List<String> listString = new CustomArrayList();

        measureAddInEndList(new CustomArrayList());
        measureAddInEndList(new ArrayList<>());
    }

    @Test
    //////test define speed add to the center list
    public void when1mlnElemAddToEndListThenOk() {

        List<String> listString = new CustomArrayList();
        List<String> listStringAr = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            listString.add("1");
            listStringAr.add("1");
        }


        measureAddInCentrList(listString);
        measureAddInCentrList(listStringAr);


        measureAddInStartList(listString);
        measureAddInStartList(listStringAr);
    }


    //define speed remove elements

    @Test

    public void whenRemoveElemFromStartListThenReturnTime() {

        List<String> listString = new CustomArrayList();
        List<String> listStringAr = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            listString.add("1");
            listStringAr.add("1");
        }


        measureRemoveElFromStartPosition(listString);
        measureRemoveElFromStartPosition(listStringAr);

        measureRemoveElFromEndPosition(listString);
        measureRemoveElFromEndPosition(listStringAr);
    }


    // -----------------------------------------------------------------------------------------------------------
    public void measureAddInEndList(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000 ; i++) {
            listString.add("1");
        }
        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время добавления миллиона эллементов " + time);
    }

    //----------------------------------------------------------------------------------------------------------------

    public void measureAddInCentrList(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 500_000; i < 500_100 ; i++) {
            listString.add(i, "2");
        }


        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время добавления в центр листа " + time);
    }

    //-----------------------------------------------------------------------------------------------------------------


    //----------------------------------------------------------------------------------------------------------------

    public void measureAddInStartList(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100 ; i++) {
            listString.add(i, "2");
        }


        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время добавления в начало листа " + time);
    }

    //-----------------------------------------------------------------------------------------------------------------

    //----------------------------------------------------------------------------------------------------------------

    public void measureRemoveElFromStartPosition(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100 ; i++) {
            listString.remove(i);
        }


        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время удаления из начала листа " + time);
    }

    //-----------------------------------------------------------------------------------------------------------------

    public void measureRemoveElFromEndPosition(List<String> listString) {
        long startTime = System.currentTimeMillis();
        for (int i = 999_9999; i < 999_900 ; i--) {
            listString.remove(i);
        }


        long finishTime = System.currentTimeMillis();

        long time = finishTime - startTime;
        System.out.println("Время удаления последних элементов листа " + time);
    }




}
