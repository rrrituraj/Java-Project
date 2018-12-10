/*
package com.tcs.HackerRank;

import java.util.Scanner;

class Test {
  public static void main(String args[]) throws Exception {

    Scanner s = new Scanner(System.in);
    int testCases = s.nextInt();
    for (int i = 0; i < testCases; i++) {
      String line = s.nextLine();
      String[] sarr = line.split(" ");
      for (String str : sarr) {
        if (!str.equals("")) {
          Integer in = Integer.parseInt(str);
          printOutput(in);
        }
      }
    }
  }

  private static void printOutput(Integer i) {
    for (Integer j = 1; j <= i; j++) {
      if (j % 3 == 0 && j % 5 != 0) {
        System.out.println("Fizz");
      } else if (j % 3 != 0 && j % 5 == 0) {
        System.out.println("Buzz");
      } else if (j % 3 == 0 && j % 5 == 0) {
        System.out.println("FizzBuzz");
      } else {
        System.out.println(j);
      }
    }
  }
}
*/
