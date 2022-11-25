package PriorityQueue;

import java.util.Map;

public class Pair<K extends Comparable<K>, V> implements Map.Entry<K, V> {

    private final K priority;
    private V element;

    public Pair(K priority, V element) {
        this.priority = priority;
        this.element = element;
    }

    @Override
    public K getKey() {
        return priority;
    }

    @Override
    public V getValue() {
        return element;
    }

    @Override
    public V setValue(V value) {
        V oldElement = element;
        element = value;
        return oldElement;
    }

    @Override
    public String toString() {
        return "(" + priority + ";" + element + ")";
    }
}
