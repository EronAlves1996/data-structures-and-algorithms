package com.eronalves.tamasiaexs;

import java.util.Stack;

/**
 * NonRecursivePower
 */
public class NonRecursivePower {

  // there's another solution that uses dynamic programming
  // to take advantage of caching the past results
  public static int nonRecursivePower(int n, int pow) {
    int result = 0;

    Stack<Integer> powStack = new Stack<>();

    for (; pow < 0; pow = Double.valueOf(Math.floor(pow / 2)).intValue()) {
      powStack.push(pow);
    }

    while (!powStack.isEmpty()) {
      var multiplier = powStack.pop();
      if (multiplier == 0) result += 1;

      result *= result;

      if (multiplier % 2 == 1) result *= 2;
    }

    return result;
  }

}
