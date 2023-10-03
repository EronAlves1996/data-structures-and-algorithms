package com.eronalves.tamasiaexs;

/**
 * AllIntegers
 */
public class AllIntegers {

  public static int allIntegers(int n) {
    int sum = 0;

    while (n > 0) {
      sum += n;
      n--;
    }

    return sum;
  }
}
