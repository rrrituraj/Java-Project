package com.tcs.threading;

public class Mythread14 extends Thread{
	int total=0;
	public void run(){
		synchronized (this) {
			System.out.println("Child Thread starts execution");
			for (int j = 0; j <= 100; j++) {
				total = total + j;
			}
			System.out.println("Child Thread notifying Main Thread");
			this.notify();
		}
	}
}
