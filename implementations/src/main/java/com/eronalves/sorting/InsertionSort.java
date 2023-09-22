package com.eronalves.sorting;

public class InsertionSort {
  // using Comparable, we have an interface that any object
  // can implements to sort
  public static <T extends Comparable<T>> void insertionSort(T[] data) {
    int length = data.length;

    for (var i = 0; i < length; i++) {
      T curr = data[i];

      int j = i;

      while (j > 0
          && data[j - 1].compareTo((T) curr) >= 1) {
        data[j] = data[j - 1];
        j--;
      }

      data[j] = curr;
    }
  }
}
