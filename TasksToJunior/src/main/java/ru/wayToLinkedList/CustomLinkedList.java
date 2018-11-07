package ru.wayToLinkedList;

import java.util.*;

public class CustomLinkedList<E> implements List<E>, Deque<E> {



    private int size = 0;

    Node<E> first;

    Node<E> last;




    public CustomLinkedList() {
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.next = next;
            this.item = element;

        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    //add element
    @Override
    public boolean add(E newElement) {

        if(size == 0) {
            Node<E> newNode = new Node<>(null, newElement, null);
            first = newNode ;
            //last = newNode;
        }
        if(size == 1) {
            Node<E> newNode = new Node<>(first, newElement, null);
            last = newNode;
        }

        if(size > 1) {
            Node<E> newNode = new Node<>(last, newElement, null);
            last = newNode;
        }

        size++;
        return true;
    }

    //add first element

    @Override
    public E getFirst() {
        Node<E> f = first;
        if(f == null){
            System.out.println("Список Пуст");
        }
        return f.item;
    }

    //add last element

    @Override
    public E getLast() {
        Node<E> l = last;
        if(l == null){
            System.out.println("Список Пуст");
        }
        return l.item;
    }


  // Empty or not list
    @Override
    public boolean isEmpty() {
        Node<E> f = first;
        if(f == null) {
            return true;
        }  else return false;

    }

    //delete first element

    @Override
    public E removeFirst() {
        E el = first.item;
        Node<E> f = first;
        if(size == 0) {
            System.out.println("Список Пуст");
        }
        if(size == 1) {
            f.item = null;
            size--;
        }

        if(size > 1){
            Node<E> next = f.next;
            f.item = null;
            f.next = null;
            first = next;
            size--;
        }

        return el;
    }

    //delete last element

    @Override
    public E removeLast() {
        E el = last.item;
        Node<E> l = last;
        if(size == 0) {
            System.out.println("Список Пуст");
        }
        if(size == 1) {
            l.item = null;
            size--;
        }
        if(size > 1){
            Node<E> prev = l.prev;
            l.item = null;
            l.prev = null;
            last = prev;
            size--;
        }

        return el;
    }

    //// delete element for index
    @Override
    public E remove(int index) {

        Node<E> x = getNodeOfIndex(index);
        E element = x.item;
        Node<E> next = x.next;
        Node<E> prev = x.prev;

        if(prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;

//        if(size == 0) {
//            System.out.println("list is empty");
//        }
//        if (size == 1) {
//            x.item = null;
//            size--;
//        }
//        if(size > 1) {
//            prev.next = next;
//            x.prev = null;
//
//            next.prev = prev;
//            x.next = null;
//
//            x.item = null;
//            size--;
//        }

       return element;

    }


    //get element for index

    @Override
    public E get(int index) {
        return getNodeOfIndex(index).item;
    }


    //получение ноды по Индексу
    Node<E> getNodeOfIndex(int index) {

        Node<E> el = null;

        if (index < size/2) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            el = x;

        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            el = x;
        }
        return el;


    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }



    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }



    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }



    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }



    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }


}
