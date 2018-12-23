package com.tcs.Java8.reference.constructor;

public class TestConstructorRef {
  public TestConstructorRef() {
    System.out.println("constructor reference");
  }

  public static void main(String[] args) {
    Interf interf=TestConstructorRef::new;
    interf.get();
  }
}
