package com.tcs.default_method;

public interface Right {
  default void m1(){
    System.out.println("Right default m1 method");
  }
}
