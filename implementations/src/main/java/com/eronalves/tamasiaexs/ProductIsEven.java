package com.eronalves.tamasiaexs;

/**
 * ProductIsEven
 */
public class ProductIsEven {

  public static boolean productIsEven(int[] values) {

    for (int i = 0; i < values.length; i++) {
      for (int j = i + 1; j < values.length; j++) {
        int first = values[i];
        int second = values[j];

        if (first == second) continue;
        if ((first * second) % 2 == 0) return true;
      }
    }

    return false;
  }
}
