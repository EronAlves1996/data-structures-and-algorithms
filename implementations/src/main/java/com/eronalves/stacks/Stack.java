package com.eronalves.stacks;

/**
 * Stack
 */
public interface Stack<E> {

  static <E> void recursiveEmpty(Stack<E> stack) {
    if (stack.isEmpty()) return;
    stack.pop();
    recursiveEmpty(stack);
  }

  int size();

  boolean isEmpty();

  void push(E e);

  E top();

  E pop();

}
