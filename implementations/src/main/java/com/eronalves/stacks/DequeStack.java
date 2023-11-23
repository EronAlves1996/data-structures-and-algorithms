package com.eronalves.stacks;

import java.util.Deque;
import java.util.LinkedList;

/**
 * DequeStack
 */
public class DequeStack<T> implements Stack<T> {

  private static int CAPACITY = 1000;
  private int capacity;
  Deque<T> storage;

  public DequeStack() {
    this(CAPACITY);
  }

  public DequeStack(int capacity) {
    this.capacity = capacity;
    storage = new LinkedList<>();
  }

  @Override
  public int size() {
    return storage.size();
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public void push(T e) {
    if (size() == capacity) throw new IllegalStateException("Stack is full");
    storage.push(e);
  }

  @Override
  public T top() {
    return storage.getLast();
  }

  @Override
  public T pop() {
    return storage.pop();
  }

}
