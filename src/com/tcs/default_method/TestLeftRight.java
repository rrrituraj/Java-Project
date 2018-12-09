package com.tcs.default_method;

public class TestLeftRight implements Left, Right {

  public static void main(String[] args) {
    Right t = new TestLeftRight();
    t.m1();
  }

  @Override
  public void m1() {
//    System.out.println("overddien m1 method");
    Right.super.m1();
  }
}
