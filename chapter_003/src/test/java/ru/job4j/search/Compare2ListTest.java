package ru.job4j.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Compare2ListTest {

    @Test
    public void whenCompareTwoListWhenListOneEqualsList2ThenZero() {

        List<String> list1 = Arrays.asList("Iv", "Iv", "Pet");
        List<String> list2 = Arrays.asList("Iv", "Iv", "Pet");

        Compare2List compare2List = new Compare2List();
        int result = compare2List.compareLis1AndList2(list1, list2);
        assertThat(result, is(0));
    }

    @Test
    public void whenCompareTwoListWhenListOneMoreList2ThenOne() {

        List<String> list1 = Arrays.asList("Iv", "Iva", "Pet");
        List<String> list2 = Arrays.asList("Iv", "Iv", "Pet");

        Compare2List compare2List = new Compare2List();
        int result = compare2List.compareLis1AndList2(list1, list2);
        assertThat(result, is(1));
    }

    @Test
    public void whenCompareTwoListWhenListOneLessListTwoThenMinusOne() {

        List<String> list1 = Arrays.asList("Iv", "Iv", "Pet");
        List<String> list2 = Arrays.asList("Iv", "Iva", "Pet");

        Compare2List compare2List = new Compare2List();
        int result = compare2List.compareLis1AndList2(list1, list2);
        assertThat(result, is(-1));
    }




}
