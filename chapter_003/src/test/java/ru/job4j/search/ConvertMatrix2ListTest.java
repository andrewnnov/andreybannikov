package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][]input = {
                {1, 2},
                {3, 4}};
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAddTwoListToList() {
        ConvertMatrix2List listToList = new ConvertMatrix2List();
        List<int[]> listArray = new ArrayList<>();
        listArray.add(new int[]{1, 2});
        listArray.add(new int[]{3, 4, 5});
        listToList.convertListArrayToListInteger(listArray);
        List<Integer> result = listToList.convertListArrayToListInteger(listArray);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAddZeroListToList() {
        ConvertMatrix2List listToList = new ConvertMatrix2List();
        List<int[]> listArray = new ArrayList<>();
        listToList.convertListArrayToListInteger(listArray);
        List<Integer> result = listToList.convertListArrayToListInteger(listArray);
        List<Integer> expect = Arrays.asList(
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAdd2darrayListToListInteger() {
        ConvertMatrix2List listToList = new ConvertMatrix2List();
        List<int[][]> listArray = new ArrayList<>();
        listArray.add(new int[][]{{1, 2}, {3, 4}});
        listArray.add(new int[][]{{5, 6, 7}, {8, 9}});

        listToList.convertList2dArrayToListInteger(listArray);
        List<Integer> result = listToList.convertList2dArrayToListInteger(listArray);
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        assertThat(result, is(expect));

    }





}
