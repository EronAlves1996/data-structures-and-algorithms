package com.eronalves.exercisestests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.eronalves.tamasiaexs.RemoveRandomly;

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

  @Test
  public void testRemoveRandomly() {
    var intArray = new Integer[] { 0, 2, 1, 5, 6, 0 };

    RemoveRandomly.removeRamdomly(intArray);

    assertTrue(Arrays.stream(intArray).allMatch(el -> el == null));
  }

}
