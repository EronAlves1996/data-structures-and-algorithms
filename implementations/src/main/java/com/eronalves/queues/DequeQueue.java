package com.eronalves.queues;

public class DequeQueue<E> implements Queue<E> {

  private Deque<E> storage;

  public DequeQueue () {
    storage = new ArrayListDeque<>();
  }

  public DequeQueue (int capacity) {
    storage = new ArrayListDeque<>(capacity);
  }

  @Override
  public int size () {
    return storage.size();
  }

  @Override
  public boolean isEmpty () {
    return storage.isEmpty();
  }

  @Override
  public void enqueue (E e) {
    storage.addLast(e);
  }

  @Override
  public E first () {
    return storage.first();
  }

  @Override
  public E dequeue () {
    return storage.removeFirst();
  }

}
