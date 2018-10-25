package ru.Zlatopolskiy.task15_21october.merge;

public class DArray {

    private long[] theArray; //Ссылка на массив the Array
    private int nElems; //колличество элементов данных

    //---------------------------------------------------
    //конструктор
    public DArray(int max) {
        theArray = new long[max];
        nElems = 0;
    }


    //занесение элемента в массив
    public void insert(long value) {
        theArray[nElems] = value; //вставка элемента
        nElems++; // увеличение размера
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");

        }
        System.out.println("***");
    }

    public void mergeSort() {
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems -1);
    }




    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if(lowerBound == upperBound){
            return;
        } else {
            int mid = (lowerBound + upperBound)/2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }

    private void merge(long[] workSpace, int lowPtr, int hightPtr, int upperBound) {

        int j = 0;
        int lowerBound = lowPtr;
        int mid = hightPtr - 1;
        int n = upperBound - lowerBound +1;

        while (lowPtr <= mid && hightPtr <=upperBound) {
            if(theArray[lowPtr] < theArray[hightPtr]){
                workSpace[j++] = theArray[lowPtr++];
            } else {
                workSpace[j++] = theArray[hightPtr++];
            }
        }

        while (lowPtr <= mid) {
            workSpace[j++]=theArray[lowPtr++];
        }

        while (hightPtr <= upperBound) {
            workSpace[j++] = theArray[hightPtr++];
        }

        for (j = 0; j < n; j++){
            theArray[lowerBound + j] = workSpace[j];
        }
    }
}
