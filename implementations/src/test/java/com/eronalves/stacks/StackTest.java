package com.eronalves.stacks;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * StackTest
 */
public class StackTest {

  @Test
  public void testStack() {
    ArrayStack<Integer> s = new ArrayStack<>();
    s.push(5);
    s.push(3);
    System.out.println(s.size());
    System.out.println(s.pop());
    System.out.println(s.isEmpty());
    System.out.println(s.pop());
    System.out.println(s.isEmpty());
    System.out.println(s.pop());
    s.push(7);
    s.push(9);
    System.out.println(s.top());
    s.push(4);
    System.out.println(s.size());
    System.out.println(s.pop());
    s.push(6);
    s.push(8);
    System.out.println(s.pop());
  }

  @Test
  public void reverseArray() {
    Integer[] a = { 4, 8, 15, 16, 23, 42 };
    String[] s = { "Jack", "Kate", "Hurley", "Jin", "Michael" };
    System.out.println("a = " + Arrays.toString(a));
    System.out.println("s = " + Arrays.toString(s));
    System.out.println("Reversing...");
    reverse(a);
    reverse(s);
    System.out.println("a = " + Arrays.toString(a));
    System.out.println("s = " + Arrays.toString(s));
  }

  private <E> void reverse(E[] a) {
    Stack<E> buffer = new ArrayStack<>();
    for (int i = 0; i < a.length; i++)
      buffer.push(a[i]);
    for (int i = 0; i < a.length; i++)
      a[i] = buffer.pop();
  }
}
