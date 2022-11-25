package Iterator;

import PriorityQueue.Pair;

public interface MyIterator<K extends Comparable<K>, V> {
    public Pair<K, V> first();

    public Pair<K, V> next();

    public boolean isDone();

    public Pair<K, V> currentItem();
}
