package com.eronalves.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {

  @Test
  public void testInsertionSort() {
    var target = new Integer[] { 0, 1, 2, 3, 4, 5 };
    var source = new Integer[] { 3, 2, 5, 1, 0, 4 };

    InsertionSort.insertionSort(source);

    assertTrue(Arrays.equals(target, source));
  }

}
