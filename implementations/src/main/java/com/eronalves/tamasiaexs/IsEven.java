package com.eronalves.tamasiaexs;

/**
 * IsEven
 */
public class IsEven {

  public static boolean isEven(int i) {
    while (i > 0) {
      i -= 2;
    }

    return i == 0;
  }
}
