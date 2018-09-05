package ru.job4j.search;

import java.util.List;

public class ConvertList2Array {

    int cells;

    public int [] [] toArray(List<Integer> list, int rows){

        if(list.size()% rows != 0){
            cells = list.size()/rows + 1;
        } else {
            cells = list.size()/rows;
        }
        int [][] array = new int[rows][cells];

        int listIndex = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <cells; j++){
               if(listIndex < list.size()){
                   array[i][j] = list.get(listIndex++);
               } else {
                   break;
               }
            }
        }
        return array;
    }

}
