package ru.job4j.array;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /**
     * multiplication table
     * @param size
     * @return table
     */
    int[][] multiple(int size){
        int [][] array = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                array[i][j] = (i+1)*(j+1);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
        return  array;
    }
}
