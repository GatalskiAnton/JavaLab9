package PriorityQueue;

public interface MyIterable<K extends Comparable<K>, V> {
    public QueueIterator<K, V> getIterator();
}