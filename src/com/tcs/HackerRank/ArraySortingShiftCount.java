package com.tcs.HackerRank;

import java.util.Arrays;

public class ArraySortingShiftCount {

  public static void main(String[] args) {
    int[] arr = new int[] {4, 3, 2, 1};
    int[] arr1 = new int[] {251,1,1,2,252,1,3,1,2};
    int[] arr2 = new int[] {2712, 15, 1, 5, 6, 14, 1153, 5, 7, 11, 9};
    int sortingShiftCounter = ArraySortingShiftCount.sortingShiftCounter(arr2);
    System.out.println(sortingShiftCounter + " " + Arrays.toString(arr2));
  }

  private static int sortingShiftCounter(int[] arr) {
    int shiftCounter = 0;
    int arrLength = arr.length;
    shiftCounter = getShiftCounter(arr, shiftCounter, arrLength);
    return shiftCounter;
  }

  private static int getShiftCounter(int[] arr, int shiftCounter, int arrLength) {
    for (int i = 0; i < arrLength/2; i++) {
      for (int j = 0; j < arrLength -1; j++) {
        if (arr[j] > arr[j + 1]) {
          swapArray(arr, j, j + 1);
          shiftCounter++;
        }
      }
    }
    return shiftCounter;
  }

  private static void swapArray(int[] arr, int i, int j) {
    int temp;
    temp = arr[i];
    arr[i] = arr[i + 1];
    arr[i + 1] = temp;
    return;
  }
}
