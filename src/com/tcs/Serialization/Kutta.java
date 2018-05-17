package com.tcs.Serialization;

import java.io.Serializable;

public class Kutta extends Animal implements Serializable {
  int j = 20;

  public Kutta() {
    System.out.println("Kutta Constuctor called");
  }
}
