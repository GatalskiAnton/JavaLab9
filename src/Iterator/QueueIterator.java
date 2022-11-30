package Iterator;

import PriorityQueue.*;

public class QueueIterator<K extends Comparable<K>, V> implements MyIterator<Pair<K, V>> {


    private int index;
    private PriorityQueue<K, V> queue;

    public QueueIterator(PriorityQueue<K, V> queue) {
        this.queue = queue;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        ++index;
    }

    @Override
    public boolean isDone() {
        return index >= queue.size() ? true : false;
    }

    @Override
    public Pair<K, V> currentItem() {
        return queue.get(index);
    }
}
