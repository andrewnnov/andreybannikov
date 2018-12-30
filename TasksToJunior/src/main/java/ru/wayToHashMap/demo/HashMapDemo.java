package ru.wayToHashMap.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class HashMapDemo<K, V> implements HashMapDemoInterface {

    private Node<K, V>[] hashTable;
    private int size = 0;
    private float threshold;

    public HashMapDemo() {
        hashTable = new Node[16];
        threshold = hashTable.length * 0.75f;
    }


    private int hash(final K key) {
        int hash = 31;
        hash = hash*17 + key.hashCode();
        return hash % hashTable.length;
    }



    @Override
    public boolean insert(final K key, final V value) {
        if(size + 1 >= threshold) {
            threshold *= 2;
            arrayDoubling();
        }

        Node<K, V> newNode = new Node<, >(key, value);


        return false;
    }

    @Override
    public boolean delete(Object key) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    private class Node<K, V> {
        private List<Node<K, V>> nodes;
        private int hash;
        private K key;
        private V value;

        public Node(List<Node<K, V>> nodes, K key, V value) {
            nodes = new LinkedList<Node<K, V>>();
            this.key = key;
            this.value = value;
        }

        public List<Node<K, V>> getNodes() {
            return nodes;
        }

        public int hash() {
            return hashCode()% hashTable.length;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            hash = 31;
            hash = hash*17 + key.hashCode();
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) {
                return true;
            }

            if(obj instanceof Node) {
                Node<K, V> node = (Node) obj;
                return (Objects.equals(key, node.getKey()) && Objects.equals(value, node.getValue()) ||
                        Objects.equals(hash, node.hashCode()));
            }
            return false;
        }
    }



}
