package com.tcs.default_method;

public class Test implements Interf {
  public void m1(){
    System.out.println("overidden default method m1");
  }
  public static void main(String[] args) {
    System.out.println("mai jinda hu bhai");
    Test test = new Test();
    test.m1();
  }
}
