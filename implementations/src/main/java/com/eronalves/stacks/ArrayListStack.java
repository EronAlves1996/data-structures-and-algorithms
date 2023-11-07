package com.eronalves.stacks;

import java.util.ArrayList;

/**
 * ArrayListStack
 */
public class ArrayListStack<T> implements Stack<T> {

  private static int CAPACITY = 1000;
  private ArrayList<T> stack;
  private int capacity;

  public ArrayListStack() {
    this(CAPACITY);
  }

  public ArrayListStack(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public int size() {
    return stack.size();
  }

  @Override
  public boolean isEmpty() {
    return stack.size() == 0;
  }

  @Override
  public void push(T e) {
    if (stack.size() > capacity) {
      throw new IllegalStateException("Stack is full");
    }
    stack.add(0, e);
  }

  @Override
  public T top() {
    return this.stack.get(0);
  }

  @Override
  public T pop() {
    return this.stack.remove(0);
  }

}
