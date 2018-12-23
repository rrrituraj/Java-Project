package com.tcs.Java8.lambda;

@FunctionalInterface
public interface Printable {

  void print();

  default void printColor() {
    System.out.println("printing colour");
  }
}
