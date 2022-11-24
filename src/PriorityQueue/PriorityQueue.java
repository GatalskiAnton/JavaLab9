package PriorityQueue;


import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<K extends Comparable<K>,V> {
    ArrayList<Pair<K,V>> queue;

    public PriorityQueue(ArrayList<Pair<K,V>> queue) {
        this.queue = queue;
        queue.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));
    }

    public void insertAll(ArrayList<Pair<K,V>> pairs)
    {
        for (var pair: pairs)
            queue.add(pair);

        queue.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));
    }
}
