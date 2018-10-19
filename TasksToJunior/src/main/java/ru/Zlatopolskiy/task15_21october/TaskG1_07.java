package ru.Zlatopolskiy.task15_21october;

/*
TaskG01_07: Реализовать метод Comparable[] mergeSortedArrays (Comarable[] arr1, Comparable arr2),
должен принимать 2 массива Comparable типов, возвращать отсортированный массив, который бы включал
все элементы из arr1 и arr2. Повторяющиеся элементы должны присутствовать.
Алгоритмическая сложность должна быть O(N)
 */
public class TaskG1_07 {


    public Comparable[] mergeSort(Comparable[] arr1, Comparable[] arr2) {
        Comparable[] mergeArr = new Comparable[arr1.length + arr2.length];

        int countArr1 = 0;
        int countArr2 = 0;

        for (int i = 0; i < mergeArr.length; i++)
            if (countArr1 == arr1.length) {
                mergeArr[i] = arr2[countArr2++];
            } else if (countArr2 == arr2.length) {
                mergeArr[i] = arr1[countArr1++];
            } else {
                if (arr1[countArr1].compareTo(arr2[countArr2]) < 0) {
                    mergeArr[i] = arr1[countArr1++];
                } else {
                    mergeArr[i] = arr2[countArr2++];
                }

            }

        return mergeArr;
    }

}
