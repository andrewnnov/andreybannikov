package ru.Zlatopolskiy.task15_21october;

/*
TaskG01_08: MergeSort - реализовать итеративное и рекурсивное решение
 */

import java.util.Arrays;

public class TaskG01_08 {

    public Comparable[] mergeSortRec(Comparable[] elements, int low, int high) {
        if(low < high) {
            int mid = (low + high)/2;
            mergeSortRec(elements, low, mid);
            mergeSortRec(elements, mid+1, high);
            merge(elements, low, mid, high);
        }
        return elements;
    }



    public Comparable[] mergeSortIter(Comparable[] elements, int low, int high) {
        Comparable [] tmp = Arrays.copyOf(elements, elements.length);

        for (int m = 1; m <= high - low; m = 2*m) {


            for(int i = low; i < high; i += 2*m){
                int from = i;
                int mid = i + m - 1;
                int to = Integer.min(i + 2*m -1, high);

                merge(tmp, from, mid, to);
            }
        }
        return tmp;
    }

    private static void merge(Comparable[] subset, int low, int mid, int high) {

        int n = high - low + 1;
        Comparable[] temp = new Comparable[n];

        int i = low;
        int j = mid+1;
        int k = 0;

        while (i <= mid || j<= high) {
            if(i > mid) {
                temp[k++] = subset[j++];
            } else if(j > high) {
                temp[k++]= subset[i++];
            } else if(subset[i].compareTo( subset[j]) < 0) {
                temp[k++] = subset[i++];
            } else {
                temp[k++] = subset[j++];
            }

        }

        for (j = 0; j < n; j++) {
            subset[low + j] = temp[j];

        }
    }



}
