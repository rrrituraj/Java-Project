package com.tcs.Java8.reference.method;

public class TestThread {

  private void m1() {
    for (int i=0;i<5;i++){
      System.out.println("Child thread - "+i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  public static void main(String[] args){
    Runnable r=new TestThread()::m1;
    Thread t1=new Thread(r);
    t1.start();
    for (int i=0;i<5;i++){
      System.out.println("Parent thread - "+i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
