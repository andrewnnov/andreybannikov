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
        myArray[size++] = o;
        return true;
    }

    //add element-------------------------------------------------------------------------------------------------------

    @Override
    public void add(int index, Object element) {
        if(defaultSize - size <= 0) {
            myArray = Arrays.copyOf(myArray, 2 * myArray.length);
        }
//        if(index > size || index < 0) {
//            System.out.println("Недопустимое значение");
//        } else {
            System.arraycopy(myArray, index, myArray, index + 1, size - index);
            myArray[index] = element;
            size++;
//        }


    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public Object get(int index) {
        return myArray[index];
    }



    @Override
    public int size() {
        return size;
    }

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
    public Object set(int index, Object element) {
        return null;
    }



    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
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
