package com.eronalves.priorityqueues;

import java.util.Comparator;

import com.eronalves.lists.LinkedPositionalList;
import com.eronalves.lists.Position;
import com.eronalves.lists.PositionalList;

/**
 * SortedPriorityQueue
 */
public class SortedPriorityQueue<K extends Comparable<K>, V>
    extends AbstractPriorityQueue<K, V> {

  private PositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

  public SortedPriorityQueue() {
    super();
  }

  public SortedPriorityQueue(Comparator<K> comp) {
    super(comp);
  }

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
    checkKey(key);
    Entry<K, V> newest = new PQEntry<>(key, value);
    Position<Entry<K, V>> walk = list.last();
    while (walk != null && compare(newest, walk.getElement()) < 0)
      walk = list.before(walk);
    if (walk == null)
      list.addFirst(newest);
    else
      list.addAfter(walk, newest);
    return newest;
  }

  @Override
  public Entry<K, V> min() {
    if (list.isEmpty()) return null;
    return list.first().getElement();
  }

  @Override
  public Entry<K, V> removeMin() {
    if (list.isEmpty()) return null;
    return list.remove(list.first());
  }

}
