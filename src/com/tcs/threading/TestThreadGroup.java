package com.tcs.threading;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;

public class TestThreadGroup {
  public static void main(String[] args) {
    //    System.out.println(Thread.currentThread().getThreadGroup().getName());
    //    System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    //      Thread.currentThread().getThreadGroup().list();

     ThreadGroup threadGroup = new ThreadGroup("tg");
    Thread t1 = new Thread(threadGroup, "firstThread");
    Thread t2 = new Thread(threadGroup, "SecondThread");
    threadGroup.setMaxPriority(3);
    Thread t3 = new Thread(threadGroup, "ThirdThread");
    System.out.println("threadGroup priority: " + threadGroup.getMaxPriority());
    System.out.println(
        "threads priority: t1- "
            + t1.getPriority()
            + " and t2- "
            + t2.getPriority()
            + " and t3- "
            + t3.getPriority());

    ThreadGroup parent = Thread.currentThread().getThreadGroup().getParent();
    System.out.println(parent.activeCount());
    Thread[] threadArray = new Thread[parent.activeCount()];
    parent.enumerate(threadArray);
    Arrays.stream(threadArray).forEach(System.out::println);


  }
}
