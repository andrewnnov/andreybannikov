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
    public List<Integer> toList(int[][] array){
        List<Integer> list = new ArrayList<>();

        int row = array.length;
        int cells = array[0].length;

        for(int i = 0; i < row; i++ ){
            for (int j = 0; j < cells; j++){
                list.add(array[i][j]);
            }
        }
        return list;
    }

    /*
    method convert list <int[]> to List<Integer>
     */
    public List<Integer> convert(List<int[]> list){
        //list for add element of input array
        List<Integer> listArrays = new ArrayList<>();
        //iteration array
        for(int[] el: list){
            //iteration element of array
            for(int j : el){
                listArrays.add(j);
            }
        }
        return listArrays;
    }
}
