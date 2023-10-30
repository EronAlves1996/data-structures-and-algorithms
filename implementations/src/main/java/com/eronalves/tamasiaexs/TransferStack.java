package com.eronalves.tamasiaexs;

import com.eronalves.stacks.Stack;

/**
 * TransferStack
 */
public class TransferStack {

  public static <T> void transfer(Stack<T> source, Stack<T> target) {
    while (source.size() != 0)
      target.push(source.pop());
  }
}
