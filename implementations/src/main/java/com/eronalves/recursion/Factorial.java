package com.eronalves.recursion;

/**
 * Factorial
 */
public class Factorial {

  public static int factorial(int n) {
    if (n < 0)
      throw new IllegalArgumentException();
    else if (n == 0)
      return 1;
    else
      return n * factorial(n - 1);
  }
}
