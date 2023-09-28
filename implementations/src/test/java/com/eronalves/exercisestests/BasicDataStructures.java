package com.eronalves.exercisestests;

import org.junit.jupiter.api.Test;

/**
 * BasicDataStructures
 */
public class BasicDataStructures {

  @Test
  public void randomNumberGeneratorsTest() {
    int next = 92;
    for (int i = 0; i < 5; i++) {
      next = (12 * next + 5) % 100;
      System.out.println(next);
    }
  }
}
