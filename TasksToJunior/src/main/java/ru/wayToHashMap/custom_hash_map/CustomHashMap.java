package ru.wayToHashMap.custom_hash_map;

import java.util.*;

public class CustomHashMap<K, V> implements Map {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int MAX_CAPACITY = 1073741824;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    public int threshold;   //предельное колличество элементов при котором массив увеличивается вдвое

    private Object[] arrayHash;   //массив ссылок
    private int size = 0;     //количество элементов хэшмапы

    public CustomHashMap() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        arrayHash = new Object[capacity];
    }

    public int getIndexOfArray(Object key) {   //определение индекса массива
        return key.hashCode() % arrayHash.length;
    }

    //class Node-----------------------------------------------------------------------------------------------------

    static class Node<K, V> implements Map.Entry<K, V> {

        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }


        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final K setKey(K newKey) {
            K oldKey = key;
            key = newKey;
            return oldKey;
        }

        @Override
        public String toString() {
            return key + " - " + value;
        }

        public final int hashCode() {

            return Objects.hashCode(key) ^ Objects.hashCode(value);
//            final int prime = 31;
//            int result = 1;
//            result = prime * result + (int)key;
//            result = prime * result + V value;
//            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this) {
                return true;
            }
            if(obj instanceof Map.Entry) {
                Map.Entry<?, ?> entry = (Map.Entry<?, ?>) obj;
                if(Objects.equals(key, entry.getKey()) && Objects.equals(value, entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
    }



        //implemented method---------------------------------------------------------------------------------------------


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        if(arrayHash[getIndexOfArray(key)] != null) {
            List<Node<K, V>> list = (List) arrayHash[getIndexOfArray(key)];
            for(Node<K, V> node : list) {
                if(node.key.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < arrayHash.length ; i++) {
            if(arrayHash[i] != null) {
                List<Node<K,V>> list = (List) arrayHash[i];
                for (Node<K, V> node: list) {
                    if(node.value.equals(value)) {
                        return true;
                    }

                }
            }
        }

        return false;
    }

    @Override
    public Object get(Object key) {
        int index = getIndexOfArray(key);
        if(arrayHash[index] != null) {
            List<Node<K, V>> nodes = (List) arrayHash[index];
            for (Node<K, V> node: nodes) {
                if(key.equals(node.key)) {
                    return node.value;
                }
            }
        }

        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        Node<K, V> newNode = new Node(key, value);

        int indexPosition = getIndexOfArray(key);

        if(arrayHash[indexPosition] == null) { //если ячейка пустая
            List nodeList = new LinkedList();

            //помещаем новый линкед в ячейку массива

            arrayHash[indexPosition] = nodeList;
            nodeList.add(newNode);
        } else {  //если ячейка не пустая

            List<Node<K, V>> nodeList = (List)arrayHash[indexPosition];
            for (Node<K, V> node: nodeList) {
                if(key == null && node.key == null || key.equals(node.key)) {
                    V tempOldValue = node.value;
                    node.value = (V)value;
                    return tempOldValue;
                }
            }
            //если не совпадают ключи то добавить элемент в список
            nodeList.add(newNode);
        }
        size++;
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
