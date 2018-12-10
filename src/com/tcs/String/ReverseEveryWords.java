package com.tcs.String;

import java.util.Arrays;

public class ReverseEveryWords {
  public static void main(String[] args) {
    String sen =
        "@ComponentScan tells Spring to look for other components, configurations, and services in the default package, allowing it to find the controllers";
    System.out.println(reversedWords(sen));
  }

  private static String reversedWords(String sen) {
    String[] splitArr = sen.split(" ");
    for (int i = 0; i < splitArr.length; i++) {
      splitArr[i] = reverse(splitArr[i]);
    }
    return Arrays.toString(splitArr);
  }

  private static String reverse(String s) {
    StringBuilder reverse = null;
    for (int i = s.length() - 1; i > 0; i--) {
      reverse = reverse.append(s.charAt(i));
    }
    return String.valueOf(reverse);
  }
}
