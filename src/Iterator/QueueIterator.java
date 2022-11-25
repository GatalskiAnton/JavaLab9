package Iterator;

import PriorityQueue.*;

import java.util.NoSuchElementException;

public class QueueIterator<K extends Comparable<K>, V> implements MyIterator<K, V> {

    private PriorityQueue<K, V> queue;

    public QueueIterator(PriorityQueue<K, V> queue) {
        this.queue = queue;
    }

    @Override
    public Pair<K, V> first() {
        if (queue.isEmpty())
            throw new NoSuchElementException("queue is empty");

        return queue.getFirst();
    }

    @Override
    public Pair<K, V> next() {
        return queue.extractMinimum();
    }

    @Override
    public boolean isDone() {
        return queue.isEmpty();
    }

    @Override
    public Pair<K, V> currentItem() {
        return queue.getMinimum();
    }
}
