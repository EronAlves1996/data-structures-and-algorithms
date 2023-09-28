package com.eronalves.tamasiaexs;

import java.util.Random;

/**
 * RemoveRandomly
 */
public class RemoveRandomly {

  public static <T> void removeRamdomly(T[] target) {
    int totalLength = target.length;
    Random random = new Random();

    while (totalLength > 0) {
      if (totalLength == 1) {
        target[0] = null;
        break;
      }

      int nextIndex = random.nextInt(totalLength - 1);
      T temp = target[totalLength - 1];
      target[totalLength - 1] = null;
      target[nextIndex] = temp;
      totalLength--;
    }
  }
}
