package com.tcs.threading;

import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {
  public static void main(String[] args) {

    ReentrantLock lock = new ReentrantLock();
    lock.lock();
    lock.lock();
    System.out.println("lock.isLocked(): " + lock.isLocked());
    System.out.println("lock.isHeldByCurrentThread(): " + lock.isHeldByCurrentThread());
    System.out.println("lock.getQueueLength(): " + lock.getQueueLength());
    System.out.println("lock.getHoldCount(): " + lock.getHoldCount());
    lock.unlock();
    System.out.println("lock.getHoldCount(): " + lock.getHoldCount());
    System.out.println("lock.isLocked(): " + lock.isLocked());
    lock.unlock();
    System.out.println("lock.isLocked(): " + lock.isLocked());
    System.out.println("lock.isFair(): " + lock.isFair());
  }
}
