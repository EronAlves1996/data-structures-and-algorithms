package com.eronalves.tamasiaexs;

/**
 * AllOddIntegers
 */
public class AllOddIntegers {

  public static int allOddIntegers(int n) {
    if (n % 2 == 0) n--;
    int result = 0;
    while (n > 0) {
      result += n;
      n -= 2;
    }
    return result;
  }
}
