package com.eronalves.analysis;

import org.junit.jupiter.api.Test;

/**
 * ExperimentalTest
 */
public class ExperimentalTest {

  private static String repeat1(char c, int n) {
    String answer = "";
    for (int j = 0; j < n; j++)
      answer += c;
    return answer;
  }

  private static String repeat2(char c, int n) {
    StringBuilder sb = new StringBuilder();

    for (int j = 0; j < n; j++)
      sb.append(c);
    return sb.toString();
  }

  @Test
  public void testExperimental() {
    long before1 = System.currentTimeMillis();
    repeat1('*', 100_000);
    long after1 = System.currentTimeMillis();
    System.out.println(after1 - before1);
    long before2 = System.currentTimeMillis();
    repeat2('*', 100_000);
    long after2 = System.currentTimeMillis();
    System.out.println(after2 - before2);
  }

}
