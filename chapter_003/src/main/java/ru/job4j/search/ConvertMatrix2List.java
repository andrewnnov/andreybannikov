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
}
