package ru.wayToArrayList;

/*
Написать юнит-тест на ArrayList: на те методы, что входят в интерфейс List.
Тест должен быть написан таким образом, чтобы можно было без труда им протестировать и LinkedList,
 без дублирования значительного количества кода.
Почитать про ArrayList у Лафоре. Создать свой класс CustomArrayList,
отнаследовать его от List, реализовать его методы. Класс должен работать как расширяющийся массив.
 */

import java.util.*;

public class CustomArrayList implements List{

    int defaultSize = 10;

    private Object[] myArray = new Object[defaultSize];

    private int size = 0; //

//    public void setMyArray(Object[] myArray) {
//        this.myArray = myArray;
//    }


    @Override
    //add element
    public boolean add(Object o) {

            if(size == myArray.length) {
                Object[] tmp = myArray;
                myArray = new Object[tmp.length + defaultSize];
                System.arraycopy(tmp, 0, myArray, 0, tmp.length);
            }
            myArray[size++] = o;

        return true;
    }

    //add element-------------------------------------------------------------------------------------------------------

    @Override
    public void add(int index, Object element) {
        if(size == myArray.length) {
            Object[] tmp = myArray;
            myArray = new Object[tmp.length + defaultSize];
            System.arraycopy(tmp, 0, myArray, 0, tmp.length);
        }
            System.arraycopy(myArray, index, myArray, index + 1, size - index);
            myArray[index] = element;
            size++;
//        }


    }

    //get ++---------------------------------------------------------------------------------------------------------------

    @Override
    public Object get(int index) {
        return myArray[index];
    }

   //size ++------------------------------------------------------------------------------------------------------

    @Override
    public int size() {
        return size;
    }

    //indexOf++         ------------------------------------------------------------------------------------------------
    @Override
    public int indexOf(Object o) {
        int result = -1;
        for (int i = 0; i < size ; i++) {
            if(o.equals(myArray[i])){
                result = i;
                break;
            }
        }
        return result;
    }

    //remove-----------------------------------------------------------------------------------------------------------------

    @Override
    public Object remove(int index) {
        Object result = myArray[index];

        System.arraycopy(myArray, index + 1 , myArray, index - 1, size - 1 - index);
        size--;

        return result;

    }

    //set----------------------------------------------------------------------------------------------------------

    @Override
    public Object set(int index, Object element) {
        Object result = myArray[index];

        myArray[index] = element;

        return result;
    }


    //----------------------------------------------------------------------------------------------------------------

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public String toString() {
        return String.valueOf(myArray);
    }


}
