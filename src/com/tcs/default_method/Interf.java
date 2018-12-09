package com.tcs.default_method;

public interface Interf {

  default void m1() {
    System.out.println("Inside interface default m1 method");
  }

  public static void main(String[] args) {
    Test test=new Test();
    test.m1();
//    Interf.main(new String[]{"Raju"});
  }
}
