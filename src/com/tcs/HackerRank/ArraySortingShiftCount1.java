package com.tcs.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArraySortingShiftCount1 {

  private static final Scanner scanner = new Scanner(System.in);

  static int insertionSort(int[] arr) {
    int shiftCounter = 0;
    int arrLength = arr.length;
    shiftCounter = getShiftCounter(arr, shiftCounter, arrLength);
    return shiftCounter;
  }

  private static int getShiftCounter(int[] arr, int shiftCounter, int arrLength) {
    for (int i = 0; i < arrLength - 1; i++) {
      for (int j = 0; j < arrLength - 1; j++) {
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

  public static void main(String[] args) throws IOException {
//    System.out.println(System.getenv("OUTPUT_PATH"));
//    System.out.println(System.getenv());
//    BufferedWriter bufferedWriter =
//        new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int[] arr = new int[n];

      String[] arrItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
        int arrItem = Integer.parseInt(arrItems[i]);
        arr[i] = arrItem;
      }

      int result = insertionSort(arr);
      System.out.println(result);

//      bufferedWriter.write(String.valueOf(result));
//      bufferedWriter.newLine();
    }

//    bufferedWriter.close();

    scanner.close();
  }
}
