package com.tcs.threading;

public class MyThread13 extends Thread {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("deamon");
			}
			System.out.println("deamon");
		}
	}
}
