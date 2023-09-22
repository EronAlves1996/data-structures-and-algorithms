package com.eronalves.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {

  @Test
  public void testInsertionSort() {
    var target = new Integer[] { 0, 1, 2, 3, 4, 5 };
    var source = new Integer[] { 3, 2, 5, 1, 0, 4 };

    InsertionSort.insertionSort(source);

    IntStream.range(0, target.length).forEach(i -> {
      assertEquals(target[i], source[i]);
    });
  }

}
