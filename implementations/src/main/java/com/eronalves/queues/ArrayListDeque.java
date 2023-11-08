package com.eronalves.queues;

import java.util.ArrayList;

/**
 * ArrayListDeque
 */
public class ArrayListDeque<T> implements Deque<T> {

  private static int CAPACITY = 1000;

  private ArrayList<T> store;
  private int storeCapacity;

  public ArrayListDeque() {
    this(CAPACITY);
  }

  public ArrayListDeque(int capacity) {
    store = new ArrayList<>(capacity);
    storeCapacity = capacity;
  }

  @Override
  public int size() {
    return store.size();
  }

  @Override
  public boolean isEmpty() {
    return store.size() == 0;
  }

  @Override
  public T first() {
    return store.get(0);
  }

  @Override
  public T last() {
    return store.get(size() - 1);
  }

  private void validateSize() {
    if (size() >= storeCapacity)
      throw new IllegalStateException("Deque is full");
  }

  @Override
  public void addFirst(T e) {
    validateSize();
    store.add(0, e);
  }

  @Override
  public void addLast(T e) {
    validateSize();
    store.add(e);
  }

  @Override
  public T removeFirst() {
    return store.remove(0);
  }

  @Override
  public T removeLast() {
    return store.remove(size() - 1);
  }

}
