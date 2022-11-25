package PriorityQueue;

import javax.swing.*;
import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;

public class PriorityQueue<K extends Comparable<K>, V> implements MyIterable<K, V> {
    ArrayList<Pair<K, V>> queue;

    public PriorityQueue(ArrayList<Pair<K, V>> queue) {
        this.queue = queue;

        queue.sort(java.util.Map.Entry.comparingByKey());
    }

    public void insertAll(ArrayList<Pair<K, V>> pairs) {
        for (var pair : pairs)
            queue.add(pair);

        queue.sort(java.util.Map.Entry.comparingByKey());
    }

    public void insert(Pair<K, V> pair) {
        queue.add(pair);
        queue.sort(java.util.Map.Entry.comparingByKey());
    }

    public Pair<K, V> getMinimum() {
        if (queue.isEmpty())
            throw new IndexOutOfBoundsException("queue is empty");

        Pair<K, V> pair = queue.get(0);
        return pair;
    }

    public Pair<K, V> extractMinimum() {
        if (queue.isEmpty())
            throw new IndexOutOfBoundsException("queue is empty");

        Pair<K, V> pair = queue.remove(0);
        queue.sort(java.util.Map.Entry.comparingByKey());
        return pair;
    }

    public Pair<K, V> getFirst() {
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void clear() {
        queue.clear();
    }

    public boolean isEqual(PriorityQueue<K, V> queue) {
        return this.equals(queue);
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public DefaultListModel toListModel()
    {
        DefaultListModel model = new DefaultListModel();
        for (var element: queue)
            model.addElement(element);

        return model;
    }
    @Override
    public QueueIterator getIterator() {
        return new QueueIterator<K, V>(this);
    }
}
