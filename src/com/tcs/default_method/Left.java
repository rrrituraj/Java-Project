package com.tcs.default_method;

public interface Left {

  default void m1(){
    System.out.println("Left Default m1 method");
  }
}
