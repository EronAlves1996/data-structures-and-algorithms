package com.eronalves.tamasiaexs;

import java.util.stream.IntStream;

/**
 * SumOfSquares
 */
public class SumOfSquares {

  public static double sumOfSquaresOf(int n) {
    return IntStream.range(0, n + 1).map(cur -> (int) Math.pow(cur, 2))
        .reduce(0, (sum, cur) -> sum + cur);
  }
}
