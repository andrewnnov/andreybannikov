package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
/*
covert array2d in ArrayList
 */
public class ConvertMatrix2List {
    /*
    covert array2d in ArrayList
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int row = array.length;
        int cells = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cells; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }

    /*
    method convertListArrayToListInteger list <int[]> to List<Integer>
     */
    public List<Integer> convertListArrayToListInteger(List<int[]> list) {
        //list for add element of input array
        List<Integer> listInteger = new ArrayList<>();
        //iteration array
        for (int[] elementOfListArray: list) {
            //iteration element of array
            for (int elementOfArray : elementOfListArray) {
                listInteger.add(elementOfArray);
            }
        }
        return listInteger;
    }

    public List<Integer> convertList2dArrayToListInteger(List<int[][]> list) {
        //list for add element of input array
        List<Integer> listInteger = new ArrayList<>();
        //iteration array
        for (int[][] elementOfList2DArray: list) {
            //iteration element of array
            for (int[] elementOfListArray : elementOfList2DArray) {
                for (int elementOfArray: elementOfListArray) {
                    listInteger.add(elementOfArray);
                }
            }
        }
        return listInteger;
    }
}
